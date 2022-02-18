package com.shravan.programs;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        String original, reverse = "";
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.println("Enter number or a string:");
        original = scanner.nextLine();
        length = original.length();
        for(int i=length-1; i>=0; i--) {
            reverse = reverse + original.charAt(i);
        }

        System.out.println("Reverse: " + reverse);

        if(original.equals(reverse)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
