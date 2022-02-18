package com.shravan.programs;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        int num, a=0, b=0, c=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = scanner.nextInt();
        for (int i=0; i<num; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");
        }
    }
}
