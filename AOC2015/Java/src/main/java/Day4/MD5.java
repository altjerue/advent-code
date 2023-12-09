package Day4;

import utils.InputData;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

// Java program to calculate MD5 hash value
// Adapted from https://www.geeksforgeeks.org/md5-hash-in-java/
public class MD5 {
    private MessageDigest md;

    public MD5() {
        try {
            this.md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public String getMd5(String input) {
            byte[] digest = this.md.digest(input.getBytes());
            return String.format("%032x", new BigInteger(1, digest));
    }

    public String startsFiveZeros(String inputFile) {
        int i = 0;
        String input;
        Scanner getInput = InputData.getInputDataFromFile(inputFile);

        input = getInput.next();
        String newInput = input.concat(String.valueOf(i));
        String md5 = getMd5(newInput);

        while (!md5.substring(0, 5).equals("00000")) {
            if (md5.substring(0, 6).equals("000000")) break;
            i += 1;
            newInput = input + Integer.toString(i);
            md5 = getMd5(newInput);
        }
        return newInput;
    }

    public String startsSixZeros(String inputFile) {
        int i = 0;
        String input;
        Scanner getInput = InputData.getInputDataFromFile(inputFile);

        input = getInput.next();
        String newInput = input.concat(String.valueOf(i));
        String md5 = getMd5(newInput);

        while (!md5.substring(0, 6).equals("000000")) {
            i += 1;
            newInput = input + Integer.toString(i);
            md5 = getMd5(newInput);
        }
        return newInput;
    }
}
