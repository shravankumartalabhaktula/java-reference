package com.shravan.programs;

import java.util.Scanner;

public class FindMissingNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Missing number is: " + findMissing(arr));
    }

    public static int findMissing(int[] arr) {
        int arraySum = (arr[arr.length - 1] * (arr[arr.length - 1] + 1)) / 2;
        for (int i : arr) {
            arraySum -= i;
        }
        return arraySum;
    }
}
