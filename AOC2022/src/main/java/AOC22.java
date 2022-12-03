import Day1.Calories;
import Day2.LoseDrawWin;
import Day2.RockPaperScissors;

/**
 * Advent of Code (not Alexandria Ocasio-Cortez, but AOC FTW!!) 2015
 */
public class AOC22 {

    private static void aocDay(int day) {
        switch (day) {
            case 1:
                System.out.println("-----  Day 1  -----");
                System.out.println("The Elf carrying most calories has " + Calories.maxCalories("src/main/resources/input/day1-part1.txt"));
                System.out.println("The Elf carrying most calories has " + Calories.max3Calories("src/main/resources/input/day1-part1.txt"));
                break;
            case 2:
                System.out.println("-----  Day 2  -----");
                System.out.println("The Elf carrying most calories has " + RockPaperScissors.rpsScore("src/main/resources/input/day2-part1.txt"));
                System.out.println("The Elf carrying most calories has " + LoseDrawWin.rpsScore("src/main/resources/input/day2-part1.txt"));
                break;
            default:
                System.out.println("We haven't done that day yet!");
                break;
        }
    }

    public static void main(String[] args) {
        aocDay(2);
    }

}
