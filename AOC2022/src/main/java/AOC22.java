import Day1.Calories;

/**
 * Advent of Code (not Alexandria Ocasio-Cortez, but AOC FTW!!) 2015
 */
public class AOC22 {

    private static void aocDay(int day) {
        switch (day) {
            case 1:
                System.out.println("-----  Day 1  -----");
                System.out.println("The Elf carrying most calories has " + Calories.maxCalories("src/main/resources/input/day1-part1.txt"));
                // System.out.println("Elves need " + howMuchPaper.totalRequiredPaper() + " square feet of wrapping paper");
                break;
            default:
                System.out.println("We haven't done that day yet!");
                break;
        }
    }

    public static void main(String[] args) {
        aocDay(1);
    }

}
