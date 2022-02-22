package com.shravan.programs;

import java.util.StringTokenizer;

public class CountWordsStringTwo {

    static final int OUT = 0;
    static final int IN = 1;

    public static void main(String[] args) {
        String str = "One two       three\n four\tfive  ";
        System.out.println("No of words : " + countWords(str));
        System.out.println("No of words using split: " + countWordsUsingSplit(str));
        System.out.println("No of words using Tokenizer: " + countWordsUsingTokenizer(str));
        System.out.println("No of words using Character: " + countWordsUsingTokenizer(str));
    }

    public static int countWords(String str) {
        int state = OUT;
        int wc = 0;
        int i = 0;

        while (i < str.length()) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '\t' || str.charAt(i) == '\n') {
                state = OUT;
            } else if (state == OUT) {
                state = IN;
                ++wc;
            }
            ++i;
        }
        return wc;
    }

    public static int countWordsUsingSplit(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        return str.split("\\s+").length;
    }

    public static int countWordsUsingTokenizer(String str) {
        StringTokenizer tokenizer = new StringTokenizer(str);
        return tokenizer.countTokens();
    }

    public static int countWordsUsingCharIsLetter(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int wordCount = 0;
        boolean isWord = false;
        int endOfLine = str.length() - 1;
        char[] ch = str.toCharArray();
        for (int i=0; i<ch.length; i++) {
            if(Character.isLetter(ch[i]) && i != endOfLine) {
                isWord = true;
            } else if (!Character.isLetter(ch[i]) && isWord) {
                wordCount++;
                isWord = false;
            } else if(Character.isLetter(ch[i]) && i == endOfLine) {
                wordCount++;
            }
        }
        return wordCount;
    }
}
