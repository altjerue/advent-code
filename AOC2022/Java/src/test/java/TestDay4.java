import Day3.Rucksacks;
import Day4.CampCleanup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay4 {

    @Test
    public void testPartOne() {
        int testPuzzleValue = 2;
            assertEquals(testPuzzleValue, CampCleanup.assignmentPairs("src/test/resources/input/day4_part1-test.txt"));
    }

    @Test
    public void testPartTwo() {
        int testPuzzleValue = 70;
        assertEquals(testPuzzleValue, Rucksacks.findPrioritiesByGroups("src/test/resources/input/day3_part1-test.txt"));
    }

}
