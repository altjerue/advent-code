import Day4.MD5;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDay4 {

    @Test
    public void testPartOne() throws FileNotFoundException {
        String testPuzzleValue;
        String md5WithAtLeastFiveZeros;
        MD5 getCryptoKey = new MD5();
        testPuzzleValue = "abcdef609043";
        assertEquals(testPuzzleValue, getCryptoKey.startsFiveZeros("src/test/input/day4_part1-test.txt"));
        testPuzzleValue = "pqrstuv1048970";
        assertEquals(testPuzzleValue, getCryptoKey.startsFiveZeros("src/test/input/day4_part1-test2.txt"));
    }

}
