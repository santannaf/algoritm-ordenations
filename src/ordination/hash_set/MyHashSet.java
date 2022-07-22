package ordination.hash_set;

import ordination.hash_map.MyHashMap;

public class MyHashSet<K> {
    int PRESENT = 1;
    private final MyHashMap<K, Integer> myHashMap = new MyHashMap<>();

    public long size() {
        return myHashMap.size;
    }

    public void add(K key) {
        myHashMap.put(key, PRESENT);
    }

    public boolean contains(K key) {
        return myHashMap.containsKey(key);
    }

    public void remove(K key) {
        myHashMap.remove(key);
    }
}