package com.shravan.programs;

public class SortArrayStrings {

    public static void main(String[] args) {
        String[] s11 = {"Now", "is", "the", "for", "all", "good", "men", "to", "come", "to", "the", "Aid"};
        for (int i=0; i<s11.length; i++) {
            for (int j=i+1; j<s11.length; j++) {
                if (s11[i].compareTo(s11[j]) < 0) {
                    String temp = s11[j];
                    s11[j] = s11[i];
                    s11[i] = temp;
                }
            }
            System.out.println(s11[i]);
        }
    }
}
