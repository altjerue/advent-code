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

    private static void aocDay(int day) {
        switch (day) {
            case 1:
                System.out.println("-----  Day 1  -----");
                LiftMonitor whereToSanta = new LiftMonitor("src/main/input/day1_part1.txt");
                System.out.println("Santa must go to floor: " + whereToSanta.floorFinder()); // puzzle answer: 280
                System.out.println("Santa first entered the basement on character: " + whereToSanta.firstBasement()); // puzzle answer: 1797
                break;
            case 2:
                System.out.println("\n-----  Day 2  -----");
                WrappingPaper howMuchPaper = new WrappingPaper("src/main/input/day2_part1.txt");
                System.out.println("Elves need " + howMuchPaper.totalRequiredPaper() + " square feet of wrapping paper"); // puzzle answer: 1588178
                System.out.println("Elves need " + howMuchPaper.totalRequiredRibbon() + " feet of ribbon"); // puzzle answer: 1588178
                break;
            case 3:
                System.out.println("\n-----  Day 3  -----");
                Delivering thisManyOneGiftHouses = new Delivering("src/main/input/day3_part1.txt");
                System.out.println(thisManyOneGiftHouses.countingHouses() + " received at least one present from Santa.");
                Delivering.roboSantaOn = true;
                System.out.println(thisManyOneGiftHouses.countingHouses() + " received at least one present from Santa and Robo-Santa.");
                break;
            case 4:
                System.out.println("\n-----  Day 4  -----");
                MD5 getCryptoKey = new MD5();
                System.out.println("The secret key is: " + getCryptoKey.startsFiveZeros("src/main/input/day4_part1.txt"));
                System.out.println("The secret key is: " + getCryptoKey.startsSixZeros("src/main/input/day4_part1.txt"));
                break;
            case 5:
                System.out.println("\n-----  Day 5  -----");
                System.out.println("The number of nice strings is: " + StringAesthetics.howManyNiceStringsMethod1("src/main/input/day5_part1.txt"));
                System.out.println("The number of new nice strings is: " + StringAesthetics.howManyNiceStringsMethod2("src/main/input/day5_part1.txt"));
                break;
            case 6:
                System.out.println("\n-----  Day 6  -----");
                break;
            default:
                System.out.println("We haven't done that day yet!");
                break;
        }

    }

    public static void main(String[] args) {
        aocDay(3);
    }

}
