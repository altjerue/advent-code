import org.junit.jupiter.api.Test;
import Day2.WrappingPaper;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay2 {

    @Test
    public void testPartOne() throws FileNotFoundException {
        int testPuzzleValue = 58 + 43;
        WrappingPaper howMuchPaper = new WrappingPaper("src/test/resources/input/day2_part1-test.txt");
        assertEquals(testPuzzleValue, howMuchPaper.totalRequiredPaper());
    }

    @Test
    public void testPartTwo() throws FileNotFoundException {
        int testPuzzleValue = 34 + 14;
        WrappingPaper howMuchPaper = new WrappingPaper("src/test/resources/input/day2_part1-test.txt");
        assertEquals(testPuzzleValue, howMuchPaper.totalRequiredRibbon());
    }

}
