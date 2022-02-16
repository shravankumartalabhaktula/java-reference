package com.shravan.stringhandlings;

public class DeleteDemo {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("This is a test.");
        sb.delete(4, 7);
        System.out.println(sb);
        sb.deleteCharAt(0);
        System.out.println(sb);
    }
}
