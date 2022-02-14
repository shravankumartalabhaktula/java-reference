package com.shravan.stringhandlings;

public class StringConstruct {

    public static void main(String[] args) {
//        Types of String constructors
        String s1 = new String();
        System.out.println(s1);

        char[] chars1 = {'a', 'b', 'c'};
        String s2 = new String(chars1);
        System.out.println(s2);

//        String s = new String(char array, start index, num of chars)
        char[] chars2 = {'a', 'b', 'c', 'd', 'e'};
        String s3 = new String(chars2, 2, 3);
        System.out.println(s3);

        char[] chars3 = {'a', 'b', 'c', 'd', 'e'};
        String s4 = new String(chars3);
        String s5 = s4;
        System.out.println(s4);
        System.out.println(s5);

        byte[] ascii1 = {65, 66, 67, 68, 69, 70};
        String s6 = new String(ascii1);
        String s7 = new String(ascii1, 2, 3);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s7.length());

//        charAt method
        char ch;
        ch = "abc".charAt(1);
        System.out.println(ch);

//        getChars method
        String s8 = "This is a demo of the getChars method.";
        int start = 10;
        int end = 14;
        char[] buf = new char[end - start];
        s8.getChars(start, end, buf, 0);
        System.out.println(buf);

//        regionMatches method
        String str1 = "Shanghai Houston Colorado Alexandria";
        String str2 = "Alexandria Colorado Houston Shanghai";
        boolean match1 = str1.regionMatches(0, str2, 28, 8);
        System.out.println(match1);

//        equals vs ==
        String s9 = "Hello";
        String s10 = new String(s9);
        System.out.println(s9.equals(s10)); // true
        System.out.println(s9 == s10); // false

//        indexOf
        String s11 = "Now is the time for all good men to come to the aid of their country";
        System.out.println(s11);
        System.out.println(s11.indexOf('N'));
        System.out.println(s11.lastIndexOf('n'));
        System.out.println(s11.indexOf("the"));
        System.out.println(s11.lastIndexOf("the"));
        System.out.println(s11.indexOf('t', 10));
        System.out.println(s11.lastIndexOf('t', 60));
    }

}
