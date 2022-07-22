package ordination.hash_set;

import ordination.introdution.Product;

public class TestMyHashSet {
    public static void main(String[] args) {
        var myHashSet = new MyHashSet<>();

        var obj1 = new Product("ps5", 5999.99D);
        var obj2 = new Product("x-box one", 5899.99D);
        var obj3 = new Product("rtx 3070", 4599.99D);

        myHashSet.add(obj1);
        myHashSet.add(obj2);
        myHashSet.add(obj3);

        System.out.println(myHashSet.size() == 3);
        System.out.println(myHashSet.contains(obj2));
        myHashSet.remove(obj2);
        System.out.println(myHashSet.size());

        System.out.println("======================================");
    }
}
