package Day5;

import utils.getInputData;

import java.util.List;
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

    public static int howManyNiceStrings(String inputFile) {
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

}
