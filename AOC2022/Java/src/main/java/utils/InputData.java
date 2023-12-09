package utils;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class InputData {

    public static Scanner getInputDataFromFile(String inputFileName) {
        try {
            return new Scanner(new FileReader(inputFileName));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
