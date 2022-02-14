package com.shravan.programs;

public class CommonStrings {

    public static void main(String[] args) {
        String[] arr1 = {"cat", "dog", "mouse"};
        String[] arr2 = {"elephant", "cat", "mouse", "lion", "zebra"};
        System.out.println("Array 1: ");
        printArray(arr1);
        System.out.println("Array 2: ");
        printArray(arr2);
        System.out.println("Common Strings: ");
        printCommon(arr1, arr2);
    }

    static void printArray(String[] arr) {
        for(String i: arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void printCommon(String[] arr1, String[] arr2) {
        for (String i: arr1) {
            for (String j: arr2) {
                if (i.equals(j)) {
                    System.out.print(i + " ");
                }
            }
        }
    }

}
