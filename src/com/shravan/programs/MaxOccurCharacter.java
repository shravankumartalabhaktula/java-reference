/*
* Given a string containing lowercase characters.
* The task is to print the maximum occurring character in the input string.
* If 2 or more characters appear the same number of times,
* print the lexicographically (alphabetically) lowest (first) character.
* */

package com.shravan.programs;

public class MaxOccurCharacter {

    public static void main(String[] args) {

        char str[] = "sample program".toCharArray();
        System.out.println("Maximum occurring character = " + getMaxOccurringChar(str));

    }

    static char getMaxOccurringChar(char[] str) {

        int[] freq = new int[26];
        int max = -1;
        char result = 0;
        int len = str.length;

        for(int i=0; i<len; i++) {
            if (str[i] != ' ')
                freq[str[i] - 'a']++;
        }

        for(int i=0; i<26; i++) {
            if(max < freq[i]) {
                max = freq[i];
                result = (char) (i + 'a');
            }
        }

        return result;
    }
}
