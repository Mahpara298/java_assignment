public class RemoveVowels {
    public static void main(String[] args) {
        String input = "I am a SQA Engineer"; // Input string
        String result = removeVowels(input); // Calling the function to remove vowels
        System.out.println(result); // Output the result
    }

    // Function to remove vowels from the given string
    public static String removeVowels(String input) {
        // Convert input string to lowercase and create a string to store result
        String vowels = "aeiouAEIOU";
        StringBuilder output = new StringBuilder();

        // Loop through each character of the input string
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // If the current character is not a vowel, append it to output
            if (vowels.indexOf(currentChar) == -1) {
                output.append(currentChar);
            }
        }

        // Return the output string with vowels removed
        return output.toString();
    }
}

