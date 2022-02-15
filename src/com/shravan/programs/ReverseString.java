package com.shravan.programs;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        reverseString("Shravan");
        reverseStringUsingScanner();
        storeReversedString();
    }

    public static void reverseString(String str) {
        char[] chars = str.toCharArray();
        for (int i=chars.length-1; i>=0; i--) {
            System.out.print(chars[i]);
        }
    }

    // Using Scanner
    public static void reverseStringUsingScanner() {
        String scannedInput = readFromCommandLine();
        reverseString(scannedInput);
    }

    // Store the reverse string into another string object
    public static void storeReversedString() {
        String scannedInput;
        StringBuilder reversedString = new StringBuilder();
        scannedInput = readFromCommandLine();

        int stringLength = scannedInput.length();
        for (int i=stringLength-1; i>=0; i--) {
            reversedString.append(scannedInput.charAt(i));
        }
        System.out.println(reversedString);
    }

    private static String readFromCommandLine() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        return scanner.nextLine();
    }
}
