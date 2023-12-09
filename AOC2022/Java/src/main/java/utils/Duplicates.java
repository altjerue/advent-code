package utils;

import java.util.Arrays;

public class Duplicates {
    public static String sortString(String str) {
        char[] chArr = str.toCharArray();
        Arrays.sort(chArr);
        return new String(chArr);
    }

    public static String removeDuplicates(String str) {
        int j = 1;
        char[] sortedString = sortString(str).toCharArray();
        for (int i = 1; i < sortedString.length; i++) {
            if (sortedString[i] != sortedString[i - 1]) {
                sortedString[j] = sortedString[i];
                j++;
            }
        }
        str = new String(sortedString);
        return str.substring(0, j);
    }
}
