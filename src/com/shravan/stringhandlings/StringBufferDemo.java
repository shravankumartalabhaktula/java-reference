package com.shravan.stringhandlings;

public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("String Buffer: " + stringBuffer);
        System.out.println("Length: " + stringBuffer.length());
        System.out.println("CapacityL: " + stringBuffer.capacity());
    }
}
