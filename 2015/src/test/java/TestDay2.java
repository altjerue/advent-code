import org.junit.jupiter.api.Test;
import utils.WrappingPaper;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay2 {

    @Test
    public void TestPartOne() throws FileNotFoundException {
        int testPuzzleValue = 58 + 43;
        WrappingPaper howMuchPaper = new WrappingPaper("src/test/input/day2_part1-test.txt");
        assertEquals(testPuzzleValue, howMuchPaper.totalRequiredPaper());
    }

}
