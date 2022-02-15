package com.shravan.programs;

import java.util.HashMap;

public class CountWordsString {

    public static void main(String[] args) {
        countStrings();
    }

    public static void countStrings() {
        String str = "This is a wonderful program this, as a program";
        String[] tokens = str.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String token : tokens) {
            if (hashMap.containsKey(token)) {
                int count = hashMap.get(token);
                hashMap.put(token, count + 1);
            } else {
                hashMap.put(token, 1);
            }
        }
        System.out.println(hashMap);
    }
}
