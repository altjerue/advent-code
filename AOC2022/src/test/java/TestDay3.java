import Day3.Rucksacks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay3 {

    @Test
    public void testPartOne() {
        int testPuzzleValue = 157;
        assertEquals(testPuzzleValue, Rucksacks.findPriorities("src/test/resources/input/day3_part1-test.txt"));
    }

    @Test
    public void testPartTwo() {
        int testPuzzleValue = 70;
        assertEquals(testPuzzleValue, Rucksacks.findPrioritiesByGroups("src/test/resources/input/day3_part1-test.txt"));
    }

}
