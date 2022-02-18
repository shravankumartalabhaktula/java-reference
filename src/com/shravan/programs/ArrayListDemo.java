package com.shravan.programs;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("20");
        al.add("30");
        al.add("40");

        Iterator iterator = al.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());

        System.out.println();

        for(Object obj : al)
            System.out.println(obj);

        System.out.println();

        for(int i=0; i<al.size(); i++)
            System.out.println(al.get(i));
    }
}
