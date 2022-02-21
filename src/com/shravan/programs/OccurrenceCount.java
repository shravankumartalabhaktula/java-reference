package com.shravan.programs;

import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurrenceCount {

    public static void main(String[] args) {

        String[] word = {"welcome", "to", "geeks", "portal"};
        String str = "geeksforgeeks is a computer science portal for geeks.";
        System.out.println(countOccurrence(word, str));
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
}
