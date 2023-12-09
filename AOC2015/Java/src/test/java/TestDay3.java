import org.junit.jupiter.api.Test;
import Day3.Delivering;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay3 {

    @Test
    public void testPartOne() throws FileNotFoundException {
        int testPuzzleValue;
        Delivering thisManyOneGiftHouses;
        testPuzzleValue = 2;
        thisManyOneGiftHouses = new Delivering("src/test/resources/input/day3_part1-test1.txt");
        assertEquals(testPuzzleValue, thisManyOneGiftHouses.countingHouses());
        testPuzzleValue = 4;
        thisManyOneGiftHouses = new Delivering("src/test/resources/input/day3_part1-test2.txt");
        assertEquals(testPuzzleValue, thisManyOneGiftHouses.countingHouses());
        testPuzzleValue = 2;
        thisManyOneGiftHouses = new Delivering("src/test/resources/input/day3_part1-test3.txt");
        assertEquals(testPuzzleValue, thisManyOneGiftHouses.countingHouses());
        testPuzzleValue = 6;
        thisManyOneGiftHouses = new Delivering("src/test/resources/input/day3_part1-test4.txt");
        assertEquals(testPuzzleValue, thisManyOneGiftHouses.countingHouses());
    }

    @Test
    public void testPartTwo() throws FileNotFoundException {
        int testPuzzleValue;
        Delivering thisManyOneGiftHouses;
        Delivering.roboSantaOn = true;
        testPuzzleValue = 3;
        thisManyOneGiftHouses = new Delivering("src/test/resources/input/day3_part1-test5.txt");
        assertEquals(testPuzzleValue, thisManyOneGiftHouses.countingHouses());
        testPuzzleValue = 3;
        thisManyOneGiftHouses = new Delivering("src/test/resources/input/day3_part1-test2.txt");
        assertEquals(testPuzzleValue, thisManyOneGiftHouses.countingHouses());
        testPuzzleValue = 11;
        thisManyOneGiftHouses = new Delivering("src/test/resources/input/day3_part1-test3.txt");
        assertEquals(testPuzzleValue, thisManyOneGiftHouses.countingHouses());
    }

}
