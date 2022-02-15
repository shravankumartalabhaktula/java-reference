package com.shravan.programs;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
//        swapNumbers();
        swapNumbersWithoutVariable();
    }

    // Using third variable
    public static void swapNumbers() {
        int X, Y, temp = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for X: ");
        X = scanner.nextInt();
        System.out.println("Enter the value for Y: ");
        Y = scanner.nextInt();
        System.out.println("Before Swap: X and Y are " + X + " and " + Y);
        temp = X;
        X = Y;
        Y = temp;
        System.out.println("After Swap: X and Y are " + X + " and " + Y);
    }

    // Without using third variable
    public static void swapNumbersWithoutVariable() {
        int X, Y = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for X: ");
        X = scanner.nextInt();
        System.out.println("Enter the value for Y: ");
        Y = scanner.nextInt();
        System.out.println("Before Swap: X and Y are " + X + " and " + Y);
        X = X + Y; // 10 + 20 = 30 (x)
        Y = X - Y; // 30 - 20 = 10 (y)
        X = X - Y; // 30 - 10 = 20 (x)
        System.out.println("After Swap: X and Y are " + X + " and " + Y);
    }
}
