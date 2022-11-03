import utils.LiftMonitor;
import utils.WrappingPaper;

import java.io.FileNotFoundException;

/**
 * Advent of Code (not Alexandria Ocasio-Cortez, but AOC FTW!!) 2015
 */
public class AOC15 {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("-----  Day 1  -----");
        LiftMonitor whereToSanta = new LiftMonitor("src/main/input/day1_part1.txt");
        System.out.println("Santa must go to floor: " + whereToSanta.FloorFinder()); // puzzle answer: 280
        System.out.println("Santa first entered the basement on character: " + whereToSanta.FirstBasement()); // puzzle answer: 1797

        System.out.println("\n-----  Day 2  -----");
        WrappingPaper howMuchPaper = new WrappingPaper("src/main/input/day2_part1.txt");
        System.out.println("Elves need " + howMuchPaper.totalRequiredPaper() + " square feet of paper"); // puzzle answer: 1588178

    }


}
