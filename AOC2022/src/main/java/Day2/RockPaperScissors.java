package Day2;

import utils.InputData;

import java.util.Scanner;

public class RockPaperScissors {

    public static int rpsScore(String rpsGuide) {
        int totalScore = 0;
        char myChoice;
        char opponentChoice;
        Scanner guide = InputData.getInputDataFromFile(rpsGuide);
        while (guide.hasNextLine()) {
            String round = guide.nextLine();
            opponentChoice = round.charAt(0);
            myChoice = round.charAt(2);
            if (isRock(myChoice)) totalScore += 1;
            if (isPaper(myChoice)) totalScore += 2;
            if (isScissors(myChoice)) totalScore += 3;
            if (isAWin(myChoice, opponentChoice)) {
                totalScore += 6;
            } else if (isADraw(myChoice, opponentChoice)) {
                totalScore += 3;
            }
        }
        return totalScore;
    }

    private static boolean isAWin(char choice1, char choice2) {
        return (isRock(choice1) && isScissors(choice2)) ||
                (isPaper(choice1) && isRock(choice2)) ||
                (isScissors(choice1) && isPaper(choice2));
    }

    private static boolean isADraw(char choice1, char choice2) {
        return (isRock(choice1) && isRock(choice2)) ||
                (isPaper(choice1) && isPaper(choice2)) ||
                (isScissors(choice1) && isScissors(choice2));
    }
    private static boolean isRock(char choice) {
        if (choice == 'A' || choice == 'X') {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPaper(char choice) {
        if (choice == 'B' || choice == 'Y') {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isScissors(char choice) {
        if (choice == 'C' || choice == 'Z') {
            return true;
        } else {
            return false;
        }
    }



}
