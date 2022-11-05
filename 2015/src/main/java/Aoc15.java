import utils.Delivering;
import utils.LiftMonitor;
import utils.WrappingPaper;

import java.io.FileNotFoundException;

/**
 * Advent of Code (not Alexandria Ocasio-Cortez, but AOC FTW!!) 2015
 */
public class Aoc15 {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("-----  Day 1  -----");
        LiftMonitor whereToSanta = new LiftMonitor("src/main/input/day1_part1.txt");
        System.out.println("Santa must go to floor: " + whereToSanta.floorFinder()); // puzzle answer: 280
        System.out.println("Santa first entered the basement on character: " + whereToSanta.firstBasement()); // puzzle answer: 1797

        System.out.println("\n-----  Day 2  -----");
        WrappingPaper howMuchPaper = new WrappingPaper("src/main/input/day2_part1.txt");
        System.out.println("Elves need " + howMuchPaper.totalRequiredPaper() + " square feet of wrapping paper"); // puzzle answer: 1588178
        System.out.println("Elves need " + howMuchPaper.totalRequiredRibbon() + " feet of ribbon"); // puzzle answer: 1588178

        System.out.println("\n-----  Day 3  -----");
        Delivering thisManyOneGiftHouses = new Delivering("src/main/input/day3_part1.txt");
        System.out.println(thisManyOneGiftHouses.countingHouses() + " received at least one present.");

    }


}
