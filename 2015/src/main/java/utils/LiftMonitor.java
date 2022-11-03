package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class LiftMonitor {
    private String instructions;

    public LiftMonitor(String instructionsInput) throws FileNotFoundException {
        /*
        Using Scanner class, found in java.util. This class is used to read
        input data from different kind of sources like files.

        If I want to read from command line, Scanner must have the argument
        System.in, i.e., Scanner(System.in).
         */
        Scanner getInstructions = new Scanner(new FileReader(instructionsInput));
        this.instructions = getInstructions.next();
    }

    public int FloorFinder() {
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

    public int FirstBasement() {
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
