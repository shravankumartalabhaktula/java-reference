package com.shravan.stringhandlings;

public class ChangeCase {
    public static void main(String[] args) {
        String s = "This is a test.";
        System.out.println("Original: " + s);
        String upper = s.toUpperCase();
        String lower = s.toLowerCase();
        System.out.println("Upper: " + upper);
        System.out.println("Lower: " + lower);
    }
}
