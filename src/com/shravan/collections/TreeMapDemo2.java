package com.shravan.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {

    public static void main(String[] args) {

        TreeMap<String, Double> tm = new TreeMap<>(new TComp());

        tm.put("John Doe", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Baker", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for(Map.Entry me : set) {
            System.out.print(me.getKey() + " : ");
            System.out.println(me.getValue());
        }
        System.out.println();

        double balance = tm.get("John Doe");
        tm.put("John Doe", balance + 1000);

        System.out.println("John Doe's Balance: " + tm.get("John Doe"));
    }
}
