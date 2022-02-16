package com.shravan.stringhandlings;

public class SetCharAtDemo {

    public static void main(String[] args) {
        StringBuilder stringBuffer = new StringBuilder("Hello");
        System.out.println("buffer before: " + stringBuffer);
        System.out.println("charAt(1) before: " + stringBuffer.charAt(1));
        stringBuffer.setCharAt(1, 'i');
        stringBuffer.setLength(2);
        System.out.println("buffer after: " + stringBuffer);
        System.out.println("charAt(1) after: " + stringBuffer.charAt(1));
    }
}
