package com.shravan.programs;

public class RemoveWhiteSpaces {

    public static void main(String[] args) {

        String str1 = "Saket Saurav        is a QualityAna    list";
        removeSpaceWithMethod(str1);
        removeSpaceWithoutMethod(str1);

    }

    public static void removeSpaceWithMethod(String str) {
        String modifiedStr = str.replaceAll("\\s", "");
        System.out.println(modifiedStr);
    }

    public static void removeSpaceWithoutMethod(String str) {
        char[] chars = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();

        for(char c: chars) {
            if (c != ' ' && c != '\t') {
                stringBuffer.append(c);
            }
        }

        System.out.println(stringBuffer);
    }


}
