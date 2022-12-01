package Day1;

import utils.InputData;

import java.util.Scanner;

public class LiftMonitor {
    private String instructions;

    public LiftMonitor(String instructionsInput) {
        /*
        Using Scanner class, found in java.util. This class is used to read
        input data from different kind of sources like files.

        If I want to read from command line, Scanner must have the argument
        System.in, i.e., Scanner(System.in).
         */
        Scanner getInstructions = InputData.getInputDataFromFile(instructionsInput);
        this.instructions = getInstructions.next();
    }

    public int floorFinder() {
        int i;
        int count = 0;

        for (i = 0; i < this.instructions.length(); i++) {
            if (this.instructions.charAt(i) == '(') {
                count += 1;
            } else {
                count -= 1;
            }
        }

        return count;
    }

    public int firstBasement() {
        int i;
        int count = 0;
        int basement = 0;

        for (i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == '(') {
                count += 1;
            } else {
                count -= 1;
            }
            if (count == -1) {
                basement = i + 1;
                break;
            }
        }

        return basement;
    }

}
