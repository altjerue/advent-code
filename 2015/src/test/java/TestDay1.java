import org.junit.jupiter.api.Test;
import utils.LiftMonitor;

import java.io.FileNotFoundException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay1 {

    @Test
    public void TestPartOne() throws FileNotFoundException {
        int testPuzzleValue = -3;
        LiftMonitor testLiftMonitor = new LiftMonitor("src/test/input/day1_part1-test.txt");
        assertEquals(testPuzzleValue, testLiftMonitor.FloorFinder());
    }

    @Test
    public void TestPartTwo() throws FileNotFoundException {
        int testPuzzleValue = 5;
        LiftMonitor testLiftMonitor = new LiftMonitor("src/test/input/day1_part2-test.txt");
        assertEquals(testPuzzleValue, testLiftMonitor.FirstBasement());
    }

}
