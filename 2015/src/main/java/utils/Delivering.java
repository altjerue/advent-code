package utils;

import grid.Coordinates;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Delivering {
    String instructions;
    public static boolean roboSantaOn = false;

    public Delivering(String elvishInstructions) throws FileNotFoundException {
        Scanner getInstructions = new Scanner(new FileReader(elvishInstructions));
        this.instructions = getInstructions.next();
    }

    public int countingHouses() {
        final int gridLength = this.instructions.length();
        int totalHouses = 1;
        char move;
        boolean coordNotInPath = true;
        Coordinates newCoordinates = new Coordinates();
        Coordinates newSantaCoordinates = new Coordinates();
        Coordinates newRoboSantaCoordinates = new Coordinates();
        ArrayList<Coordinates> path = new ArrayList<>();
        path.add(newCoordinates);

        for (int l = 0; l < gridLength; l++) {
            move = this.instructions.charAt(l);

            // TODO: separate paths: one for Santa (even numbers), and the other
            //  for RoboSanta (odd numbers)
            if (l % 2 == 0 && roboSantaOn) {
                newRoboSantaCoordinates = Coordinates.shiftCoordinate(move,
                        newRoboSantaCoordinates.getCoordinates().get(0),
                        newRoboSantaCoordinates.getCoordinates().get(1));
                newCoordinates = newRoboSantaCoordinates;
            } else {
                newSantaCoordinates = Coordinates.shiftCoordinate(move,
                        newSantaCoordinates.getCoordinates().get(0),
                        newSantaCoordinates.getCoordinates().get(1));
                newCoordinates = newSantaCoordinates;
            }

            coordNotInPath = Coordinates.isCoordinateNotInPath(newCoordinates, path);

            if (coordNotInPath) {
                totalHouses += 1;
            }

        }

        return totalHouses;

    }

}
