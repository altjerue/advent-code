package Day5;

import utils.getInputData;

import java.util.Scanner;

public class StringAesthetics {

    private static boolean hasThreeVowels(String inputString) {
        int vSum = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if ("aeiou".contains(String.valueOf(inputString.charAt(i)))) vSum++;
            if (vSum >= 3 ) return true;
        }
        return false;
    }

    private static boolean hasDoubleLetter(String inputString) {
        for (int i = 0; i < inputString.length() - 1; i++) {
            if (inputString.charAt(i) == inputString.charAt(i + 1)) return true;
        }
        return false;
    }

    private static boolean hasDoubleDoubleLetter(String inputString) {
        String str1;
        String str2;
        for (int i = 0; i < inputString.length() - 1; i++) {
            str1 = inputString.substring(i, i + 2);
            for (int j = i + 2; j < inputString.length() - 1; j++) {
                str2 = inputString.substring(j, j + 2);
                if (str1.equals(str2)) return true;
            }
        }
        return false;
    }

    private static boolean hasDoubleLetterInbetweener(String inputString) {
        for (int i = 0; i < inputString.length() - 2; i++) {
            if (inputString.charAt(i) == inputString.charAt(i + 2)) return true;
        }
        return false;
    }

    private static boolean hasBannedStrings(String inputString) {
        if (inputString.contains("ab")) {
            return true;
        } else if (inputString.contains("cd")) {
            return true;
        } else if (inputString.contains("pq")) {
            return true;
        } else if (inputString.contains("xy")) {
            return true;
        } else {
            return false;
        }
    }

    public static int howManyNiceStringsMethod1(String inputFile) {
        int niceStrings = 0;
        Scanner getInput = getInputData.getInputDataFromFile(inputFile);
        while(getInput.hasNextLine()) {
            String string = getInput.nextLine().toString();
            if (hasBannedStrings(string)) {
                continue;
            } else {
                if (hasThreeVowels(string) && hasDoubleLetter(string)) {
                    niceStrings += 1;
                } else {
                    continue;
                }
            }
        }
        return niceStrings;
    }

    public static int howManyNiceStringsMethod2(String inputFile) {
        int niceStrings = 0;
        Scanner getInput = getInputData.getInputDataFromFile(inputFile);
        while(getInput.hasNextLine()) {
            String string = getInput.nextLine().toString();
            if (hasDoubleLetterInbetweener(string) && hasDoubleDoubleLetter(string)) {
                niceStrings += 1;
            } else {
                continue;
            }
        }
        return niceStrings;
    }

}
