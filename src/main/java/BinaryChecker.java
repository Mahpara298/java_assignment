import java.util.Scanner;

public class BinaryChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Take the string from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Check if the string is binary
        boolean isBinary = true;
        for (char c : input.toCharArray()) {
            if (c != '0' && c != '1') {
                isBinary = false;
                break; // Stop checking further if a non-binary character is found
            }
        }

        // Output the result
        System.out.println("Is the string binary? " + isBinary);
    }
}