import org.junit.jupiter.api.Test;
import utils.Delivering;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay3 {

    @Test
    public void testPartOne() throws FileNotFoundException {
        int testPuzzleValue;
        Delivering thisManyOneGiftHouses;
        testPuzzleValue = 2;
        thisManyOneGiftHouses = new Delivering("src/test/input/day3_part1-test1.txt");
        assertEquals(testPuzzleValue, thisManyOneGiftHouses.countingHouses());
        testPuzzleValue = 6;
        thisManyOneGiftHouses = new Delivering("src/test/input/day3_part1-test2.txt");
        assertEquals(testPuzzleValue, thisManyOneGiftHouses.countingHouses());
        testPuzzleValue = 2;
        thisManyOneGiftHouses = new Delivering("src/test/input/day3_part1-test3.txt");
        assertEquals(testPuzzleValue, thisManyOneGiftHouses.countingHouses());
    }

    // @Test
    // public void testPartTwo() throws FileNotFoundException {
    //     int testPuzzleValue = 5;
    //     LiftMonitor testLiftMonitor = new LiftMonitor("src/test/input/day1_part2-test.txt");
    //     assertEquals(testPuzzleValue, testLiftMonitor.firstBasement());
    // }

}
