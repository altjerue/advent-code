import java.util.Scanner;

public class GetFloor {

    public static void main(String[] args) {
        Scanner getInstructions = new Scanner(System.in);
        String instructions = getInstructions.next();
        floorFinder(instructions);
    }

    private static void floorFinder(String instructions) {
        int i;
        int count = 0;
        int basement = 0;
        boolean basementFirst = true;

        for (i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == '(') {
                count += 1;
            } else {
                count -= 1;
            }
            if (count == -1 && basementFirst) {
                basement = i + 1;
                basementFirst = false;
            }
        }

        System.out.println("Santa must go to floor: " + count +
                "\nSanta first entered the basement on character: " + basement +
                "\nTotal number of steps: " + i);

    }

}
