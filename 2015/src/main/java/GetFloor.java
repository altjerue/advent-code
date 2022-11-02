import java.util.Scanner;

public class GetFloor {

    public static void main(String[] args) {
        Scanner getInstructions = new Scanner(System.in);
        String instructions = getInstructions.next();
        int count = 0;

        for (int i = 0; i < instructions.length(); i++) {
            if (instructions.charAt(i) == '(') {
                count += 1;
            } else {
                count -= 1;
            }

        }

        System.out.println(String.format("Floor: %d", count));

    }

}
