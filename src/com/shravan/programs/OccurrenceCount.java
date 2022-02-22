package com.shravan.programs;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurrenceCount {

    public static void main(String[] args) {

        String[] word = {"welcome", "to", "geeks", "portal"};
        String str = "geeksforgeeks is a computer science portal for geeks.";
        System.out.println(countOccurrence(word, str));
        System.out.println(countOccurrenceUsingSplit("portal", str));
    }

    public static int countOccurrence(String[] word, String str) {
        int counter = 0;
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(str);

        HashSet<String> hashSet = new HashSet<>();
        for(String string : word) {
            hashSet.add(string);
        }
        while (matcher.find()){
            if(hashSet.contains(matcher.group()))
                counter++;
        }
        return counter;
    }

    public static int countOccurrenceUsingSplit(String word, String str) {
        String a[] = str.split(" ");
        int count = 0;
        for (int i=0; i<a.length; i++) {
            if (word.equals(a[i]))
                count++;
        }
        return count;
    }
}
