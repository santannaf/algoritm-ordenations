package ordination.hash_map;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap<K, V> {
    public long size = 0;
    int n = 16;
    private List<Node>[] buckets;

    private class Node {
        final K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        initBuckets(n);
    }

    private void initBuckets(int n) {
        buckets = new List[n];
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }
    }

    public void put(K key, V value) {
        int index = hashFn(key);
        int di = getIndexWithInBucket(key, index);

        if (di != -1) {
            Node node = buckets[index].get(di);
            node.value = value;
        } else {
            Node node = new Node(key, value);
            buckets[index].add(node);
            size++;
        }

        double lambda = size * 1.0 / buckets.length;
        if (lambda > 2.0) {
            rehash();
        }
    }

    private void rehash() {
        List<Node>[] x = buckets;

        initBuckets(x.length);
        size = 0;

        for (List<Node> nodes : x) {
            for (Node node : nodes) {
                put(node.key, node.value);
            }
        }
    }

    private int getIndexWithInBucket(K key, int index) {
        int di = 0;
        for (Node node : buckets[index]) {
            if (node.key.equals(key)) return di;
            di++;
        }
        return -1;
    }

    private int hashFn(K key) {
        int hc = key.hashCode();
        return Math.abs(hc) % buckets.length;
    }

    public boolean containsKey(K key) {
        int index = hashFn(key);
        int di = getIndexWithInBucket(key, index);
        return di != -1;
    }

    public V remove(K key) {
        int index = hashFn(key);
        int di = getIndexWithInBucket(key, index);

        if (di != -1) {
            Node node = buckets[index].remove(di);
            size--;
            return node.value;
        }

        return null;
    }
}