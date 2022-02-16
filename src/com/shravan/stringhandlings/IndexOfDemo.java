package com.shravan.stringhandlings;

public class IndexOfDemo {

    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("one two one");
        int i;
        i = stringBuffer.indexOf("one");
        System.out.println(i);
        i = stringBuffer.lastIndexOf("one");
        System.out.println(i);
    }
}
