package com.shravan.collections;

import java.util.ArrayList;
import java.util.Spliterator;

public class SpliteratorDemo {

    public static void main(String[] args) {

        ArrayList<Double> vals = new ArrayList<>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        Spliterator<Double> splitr = vals.spliterator();
        while(splitr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        splitr = vals.spliterator();

        ArrayList<Double> sqrs = new ArrayList<>();
        while (splitr.tryAdvance(n -> sqrs.add(Math.sqrt(n))));

        splitr = sqrs.spliterator();
        splitr.forEachRemaining(n -> System.out.println(n));
        System.out.println();
    }
}
