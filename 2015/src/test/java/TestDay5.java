import Day5.StringAesthetics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay5 {

    @Test
    public void testPartOne() {
        int testPuzzleValue = 2;
        assertEquals(testPuzzleValue, StringAesthetics.howManyNiceStringsMethod1("src/test/input/day5_part1-test1.txt"));
    }

    @Test
    public void testPartTwo() {
        int testPuzzleValue = 2;
        assertEquals(testPuzzleValue, StringAesthetics.howManyNiceStringsMethod2("src/test/input/day5_part2-test1.txt"));
    }

}
