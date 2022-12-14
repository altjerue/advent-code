import Day1.LiftMonitor;

import java.io.FileNotFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay1 {

    @Test
    public void testPartOne() {
        int testPuzzleValue = -3;
        LiftMonitor testLiftMonitor = new LiftMonitor("src/test/resources/input/day1_part1-test.txt");
        assertEquals(testPuzzleValue, testLiftMonitor.floorFinder());
    }

    @Test
    public void testPartTwo() throws FileNotFoundException {
        int testPuzzleValue = 5;
        LiftMonitor testLiftMonitor = new LiftMonitor("src/test/resources/input/day1_part2-test.txt");
        assertEquals(testPuzzleValue, testLiftMonitor.firstBasement());
    }

}
