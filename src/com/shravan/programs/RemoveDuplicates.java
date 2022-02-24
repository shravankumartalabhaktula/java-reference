/*
* Given a string S, the task is to remove all the duplicates in the given string.
* */

package com.shravan.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    // Normal
    static String removeDuplicates(char[] str, int n) {
        int index = 0;

        for(int i = 0; i < n; i++) {
            int j;
            for(j = 0; j < i; j++) {
                if (str[i] == str[j]) {
                    break;
                }
            }
            if (j == i) {
                str[index++] = str[i];
            }
        }

        return String.valueOf(Arrays.copyOf(str, index));
    }

    // Using Binary Search Tree
    static void removeDuplicatesUsingBST(char[] str, int n) {
        HashSet<Character> s = new LinkedHashSet<>(n-1);
        for(char x : str) {
            s.add(x);
        }
        for(char x : s) {
            System.out.print(x);
        }
    }

    // Using Sort
    /* Method to remove duplicates in a sorted array */
    static String removeDupsSorted(String str) {
        int res_ind = 1, ip_ind = 1;
        char[] chars = str.toCharArray();

        while (ip_ind != chars.length) {
            if(chars[ip_ind] != chars[ip_ind-1]) {
                chars[res_ind] = chars[ip_ind];
                res_ind++;
            }
            ip_ind++;
        }

        str = new String(chars);
        return str.substring(0, res_ind);
    }

    /* Method removes duplicate characters from the string
       This function work in-place and fills null characters
       in the extra space left */
    static String removeDups(String str) {
        char temp[] = str.toCharArray();
        Arrays.sort(temp);
        str = new String(temp);

        // Remove duplicates from sorted
        return removeDupsSorted(str);
    }

    public static void main(String[] args) {
        char[] str = "geeksforgeeks".toCharArray();
        int n = str.length;
        System.out.println(removeDuplicates(str, n));
        removeDuplicatesUsingBST(str, n);
        System.out.println();
        System.out.println(removeDups("geeksforgeeks"));
    }
}
