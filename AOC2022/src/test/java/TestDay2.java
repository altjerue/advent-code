import Day1.Calories;
import Day2.RockPaperScissors;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay2 {
    @Test
    public void testPartOne() {
        int testPuzzleValue = 15;
        assertEquals(testPuzzleValue, RockPaperScissors.rpsScore("src/test/resources/input/day2_part1-test.txt"));
    }

}
