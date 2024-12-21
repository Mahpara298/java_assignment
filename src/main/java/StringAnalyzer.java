import java.util.Scanner;

public class StringAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Take input from the user
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Step 2: Initialize counters
        int wordCount = 0;
        int charCount = 0;
        int vowelCount = 0;
        int consonantCount = 0;

        // Step 3: Count words
        String[] words = input.split("\\s+"); // Split by spaces
        wordCount = words.length;

        // Step 4: Process each character
        for (char c : input.toCharArray()) {
            if (c != ' ') {
                charCount++; // Increment character count (excluding spaces)

                // Check for vowels and consonants
                if (isVowel(c)) {
                    vowelCount++;
                } else if (Character.isLetter(c)) {
                    consonantCount++;
                }
            }
        }

        // Step 5: Display the results
        System.out.println("Words: " + wordCount);
        System.out.println("Chars: " + charCount);
        System.out.println("Vowel: " + vowelCount);
        System.out.println("Consonant: " + consonantCount);
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c); // Convert to lowercase
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
