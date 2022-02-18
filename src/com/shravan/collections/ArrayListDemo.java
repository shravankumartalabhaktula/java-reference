package com.shravan.collections;

import java.util.ArrayList;

public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Initial Size: " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");

        System.out.println("Size after additions: " + al.size());

        System.out.println(al);

        al.remove("F");
        al.remove(2);
        System.out.println("Size after deletions: " + al.size());
        System.out.println(al);
    }
}
