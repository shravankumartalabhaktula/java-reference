package com.shravan.programs;

public class MaxAndMin {

    public static void main(String[] args) {
        int[] arr = {20, 20, 30, 1, 2, -1, -20, 50};
        findMinMax(arr);
        findMinMaxWithRecursion(arr);
    }

    public static void findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int j : arr) {
            if (max < j) {
                max = j;
            } else if (min > j) {
                min = j;
            }
        }
        System.out.println("Min and Max numbers are: " + min + " " + max);
    }

    public static void findMinMaxWithRecursion(int[] arr) {
        System.out.println("Min and Max numbers are: " + minUsingRecursion(arr, arr[0], 0) + " " + maxUsingRecursion(arr, arr[0], 0));
    }

    private static int maxUsingRecursion(int[] arr, int num, int size) {
        if(size == arr.length) {
            return arr[size - 1];
        }
        return Math.max(num, maxUsingRecursion(arr, arr[size], ++size));
    }

    private static int minUsingRecursion(int[] arr, int num, int size) {
        if(size == arr.length) {
            return arr[size - 1];
        }
        return Math.min(num, minUsingRecursion(arr, arr[size], ++size));
    }
}
