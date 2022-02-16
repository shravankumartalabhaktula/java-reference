package com.shravan.stringhandlings;

public class InsertDemo {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("I Java");
        stringBuffer.insert(2, "like ");
        System.out.println(stringBuffer);
    }
}
