import Day4.MD5;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay4 {

    @Test
    public void testPartOne() {
        String testPuzzleValue;
        MD5 getCryptoKey = new MD5();
        testPuzzleValue = "abcdef609043";
        assertEquals(testPuzzleValue, getCryptoKey.startsFiveZeros("src/test/resources/input/day4_part1-test.txt"));
        testPuzzleValue = "pqrstuv1048970";
        assertEquals(testPuzzleValue, getCryptoKey.startsFiveZeros("src/test/resources/input/day4_part1-test2.txt"));
    }

}
