import utils.LiftMonitor;

import java.io.FileNotFoundException;

/**
 * Advent of Code (not Alexandria Ocasio-Cortez) 2015
 */
public class AOC15 {

    public static void main(String[] args) throws FileNotFoundException {
        LiftMonitor whereToSanta = new LiftMonitor("src/main/input/day1_part1.txt");
        System.out.println("Santa must go to floor: " + whereToSanta.FloorFinder()); // puzzle answer: 280
        System.out.println("Santa first entered the basement on character: " + whereToSanta.FirstBasement()); // puzzle answer: 1797
    }


}
