package Day3;

public class Priorities {

    /**
     * Uppercase characters start at (int) 'A' = 65, and (int) 'Z' = 90
     * Lowercase characters start at (int) 'a' = 97, and (int) 'z' = 122
     *
     * @param c char
     * @return int priority value
     */
    public static int getPriority(char c) {
        int priority = 0;
        int intChar = (int) c;
        if (intChar >= 97 && intChar <= 122) { // lower case
            priority = intChar - 96;
        } else if (intChar >= 65 && intChar <= 90) { // upper case
            priority = intChar - 65 + 27;
        } else {
            System.out.println("This is neither uppercase nor lowercase letter");
            return 0;
        }
        return priority;
    }

    public static void charAndInt(char c) {
        int i = (int) c;
        while (i < 125) {
            System.out.println("Character " + (char) i + " has integer " + i);
            i++;
        }
    }
}
