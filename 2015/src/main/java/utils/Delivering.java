package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Delivering {
    String instructions;
    // Scanner instructions;

    public Delivering(String elvishInstructions) throws FileNotFoundException {
        Scanner getInstructions = new Scanner(new FileReader(elvishInstructions));
        this.instructions = getInstructions.next();
    }

    public int countingHouses() {
        int gridLength = this.instructions.length();
        boolean[][] grid = new boolean[2 * gridLength + 1][2 * gridLength + 1];
        int shiftNorthSouth = gridLength;
        int shiftEastWest = gridLength;
        int totalHouses = 1;
        char move;

        grid[shiftEastWest][shiftNorthSouth] = true;

        for (int l = 0; l < gridLength; l++) {
            move = this.instructions.charAt(l);

            switch (move) {
                case '^':
                    shiftNorthSouth += 1;
                    totalHouses = findInGrid(grid, shiftNorthSouth, shiftEastWest, totalHouses);
                    break;
                case 'v':
                    shiftNorthSouth -= 1;
                    totalHouses = findInGrid(grid, shiftNorthSouth, shiftEastWest, totalHouses);
                    break;
                case '>':
                    shiftEastWest += 1;
                    totalHouses = findInGrid(grid, shiftNorthSouth, shiftEastWest, totalHouses);
                    break;
                case '<':
                    shiftEastWest -= 1;
                    totalHouses = findInGrid(grid, shiftNorthSouth, shiftEastWest, totalHouses);
                    break;
            }
        }
        return totalHouses;
    }

    private int findInGrid(boolean[][] grid, int shiftNorthSouth, int shiftEastWest, int totalHouses) {
        if (!grid[shiftEastWest][shiftNorthSouth]) {
            grid[shiftEastWest][shiftNorthSouth] = true;
            totalHouses += 1;
        }
        return totalHouses;
    }

}
