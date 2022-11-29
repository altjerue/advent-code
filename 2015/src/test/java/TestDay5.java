import Day5.StringAesthetics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay5 {

    @Test
    public void testPartOne() {
        int testPuzzleValue = 2;
        assertEquals(testPuzzleValue, StringAesthetics.howManyNiceStrings("src/test/input/day5_part1-test1.txt"));
    }

}
