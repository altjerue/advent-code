import Day4.MD5;
import Day3.Delivering;
import Day2.WrappingPaper;
import Day1.LiftMonitor;
import Day5.StringAesthetics;

import java.io.FileNotFoundException;

/**
 * Advent of Code (not Alexandria Ocasio-Cortez, but AOC FTW!!) 2015
 */
public class Aoc15 {

    public static void main(String[] args) throws FileNotFoundException {
        int day = 5;

        switch (day) {
            case 1:
                System.out.println("-----  Day 1  -----");
                LiftMonitor whereToSanta = new LiftMonitor("2015/src/main/input/day1_part1.txt");
                System.out.println("Santa must go to floor: " + whereToSanta.floorFinder()); // puzzle answer: 280
                System.out.println("Santa first entered the basement on character: " + whereToSanta.firstBasement()); // puzzle answer: 1797
            case 2:
                System.out.println("\n-----  Day 2  -----");
                WrappingPaper howMuchPaper = new WrappingPaper("2015/src/main/input/day2_part1.txt");
                System.out.println("Elves need " + howMuchPaper.totalRequiredPaper() + " square feet of wrapping paper"); // puzzle answer: 1588178
                System.out.println("Elves need " + howMuchPaper.totalRequiredRibbon() + " feet of ribbon"); // puzzle answer: 1588178
            case 3:
                System.out.println("\n-----  Day 3  -----");
                Delivering thisManyOneGiftHouses = new Delivering("2015/src/main/input/day3_part1.txt");
                System.out.println(thisManyOneGiftHouses.countingHouses() + " received at least one present from Santa.");
                Delivering.roboSantaOn = true;
                System.out.println(thisManyOneGiftHouses.countingHouses() + " received at least one present from Santa and Robo-Santa.");
            case 4:
                System.out.println("\n-----  Day 4  -----");
                MD5 getCryptoKey = new MD5();
                System.out.println("The secret key is: " + getCryptoKey.startsFiveZeros("2015/src/main/input/day4_part1.txt"));
                System.out.println("The secret key is: " + getCryptoKey.startsSixZeros("2015/src/main/input/day4_part1.txt"));
            case 5:
                System.out.println("\n-----  Day 5  -----");
                System.out.println(String.format("The number of nice strings is: %d", StringAesthetics.howManyNiceStringsMethod1("2015/src/main/input/day5_part1.txt")));
                System.out.println(String.format("The number of new nice strings is: %d", StringAesthetics.howManyNiceStringsMethod2("2015/src/main/input/day5_part1.txt")));
        }
    }

}
