package com.shravan.programs;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a value: ");

        int num = scanner.nextInt();
        scanner.close();

        int temp;
        boolean isPrime = true;

        for (int i = 2; i <= num/2; i++) {
            temp = num%i;
            if (temp == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not a Prime");
        }
    }
}
