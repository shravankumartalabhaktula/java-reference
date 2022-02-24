package com.shravan.collections;

import java.util.Comparator;

public class CompLastNames implements Comparator<String> {

    @Override
    public int compare(String aStr, String bStr) {
        int i, j;

        i = aStr.lastIndexOf(' ');
        j = bStr.lastIndexOf(' ');


        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}
