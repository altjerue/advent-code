import java.util.Scanner;

public class GetFloor {

    public static void main(String[] args) {
        Scanner getInstructions = new Scanner(System.in);
        String instructions = getInstructions.next();
        System.out.println("Floor: " + floorFinder(instructions));
    }

    private static int floorFinder(String instructions) {
        int count = 0;
        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == '(') {
                count += 1;
            } else {
                count -= 1;
            }
        }
        return count;
    }

}
