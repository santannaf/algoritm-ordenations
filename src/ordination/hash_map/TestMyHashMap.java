package ordination.hash_map;

import ordination.introdution.Introduction;
import ordination.introdution.Product;

import java.util.ArrayList;
import java.util.HashMap;

public class TestMyHashMap {
    public static void main(String[] args) {
        var myHashMap = new MyHashMap<Product, String>();

        var objectOne = new Product("ps5", 5999.99D);
        var objectSecond = new Product("x-box one", 5899.99D);

        myHashMap.put(objectOne, "Object-1");
        myHashMap.put(objectSecond, "Object-2");

        System.out.println(myHashMap.size == 2);
        System.out.println(myHashMap.containsKey(objectOne));
        System.out.println(myHashMap.remove(objectOne));
        System.out.println(myHashMap.size == 2);


        System.out.println();


    }


}