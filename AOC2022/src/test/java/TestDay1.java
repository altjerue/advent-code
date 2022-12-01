import Day1.Calories;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay1 {
    @Test
    public void testPartOne() {
        int testPuzzleValue = 24000;
        assertEquals(testPuzzleValue, Calories.maxCalories("src/test/resources/input/day1_part1-test.txt"));
    }

}
