package com.shravan.programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIteration {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(2, "Saket");
        map.put(25, "Saurav");
        map.put(12, "HashMap");

        System.out.println(map.size());

        Iterator itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry me = (Map.Entry) itr.next();
            System.out.println("Key is: " + me.getKey() + " Value is: " + me.getValue());
        }

        for (Map.Entry me : map.entrySet()) {
            System.out.println("Key is: " + me.getKey() + " Value is: " + me.getValue());
        }
    }
}
