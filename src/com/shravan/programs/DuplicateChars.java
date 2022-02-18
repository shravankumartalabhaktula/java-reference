package com.shravan.programs;

public class DuplicateChars {

    public static void main(String[] args) {

        String str = new String("Shravan");

        int count = 0;

        char[] chars = str.toCharArray();

        for(int i=0; i<chars.length; i++) {
            for(int j=i+1; j<chars.length; j++) {
                if(chars[i] == chars[j]) {
                    System.out.println(chars[j]);
                    count++;
                    break;
                }
            }
        }
    }
}
