
import java.util.Scanner;

public class PangramChecker {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence to check if it's a pangram:");
        String input = scanner.nextLine();

        if (isPangram(input)) {
            System.out.println("The given sentence is a pangram!");
        } else {
            System.out.println("The given sentence is not a pangram.");
        }

        scanner.close();
    }

    private static boolean isPangram(String input) {
        // Assuming the input is in English and case-insensitive
        input = input.toLowerCase();

        // Create an array to mark the presence of each letter
        boolean[] isPresent = new boolean[26];

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isLetter(currentChar)) {
                // Mark the presence of the letter
                isPresent[currentChar - 'a'] = true;
            }
        }

        // Check if all letters are present
        for (boolean letterPresent : isPresent) {
            if (!letterPresent) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {
        return "PangramChecker []";
    }
}

