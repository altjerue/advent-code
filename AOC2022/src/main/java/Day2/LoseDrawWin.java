package Day2;

import utils.InputData;

import java.util.Scanner;

public class LoseDrawWin {

    public static int rpsScore(String rpsGuide) {
        int totalScore = 0;
        char myChoice;
        char opponentChoice;
        Scanner guide = InputData.getInputDataFromFile(rpsGuide);
        while (guide.hasNextLine()) {
            String round = guide.nextLine();
            opponentChoice = round.charAt(0);
            myChoice = round.charAt(2);
            if (isWin(myChoice)) {
                totalScore += 6;
                if (isRock(opponentChoice)) totalScore += 2; // I choose paper
                if (isPaper(opponentChoice)) totalScore += 3; // I choose scissors
                if (isScissors(opponentChoice)) totalScore += 1; // I choose rock
            } else if (isDraw(myChoice)) {
                totalScore += 3;
                if (isRock(opponentChoice)) totalScore += 1; // I choose rock
                if (isPaper(opponentChoice)) totalScore += 2; // I choose paper
                if (isScissors(opponentChoice)) totalScore += 3; // I choose scissors
            } else {
                if (isRock(opponentChoice)) totalScore += 3; // I choose scissors
                if (isPaper(opponentChoice)) totalScore += 1; // I choose rock
                if (isScissors(opponentChoice)) totalScore += 2; // I choose paper
            }
        }
        return totalScore;
    }

    private static boolean isRock(char choice) {
        if (choice == 'A') {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isPaper(char choice) {
        if (choice == 'B') {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isScissors(char choice) {
        if (choice == 'C') {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isLose(char choice) {
        if (choice == 'X') {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isDraw(char choice) {
        if (choice == 'Y') {
            return true;
        } else {
            return false;
        }
    }

    private static boolean isWin(char choice) {
        if (choice == 'Z') {
            return true;
        } else {
            return false;
        }
    }

}
