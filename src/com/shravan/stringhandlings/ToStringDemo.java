package com.shravan.stringhandlings;

public class ToStringDemo {

    public static void main(String[] args) {
        BoxToString boxToString = new BoxToString(10, 12, 14);
        String s = "Box b: " + boxToString;
        System.out.println(s);
        System.out.println(boxToString);
    }
}
