import java.util.Random;

public class RandomNumbersArray {
    public static void main(String[] args) {
        // Step 1: Declare an array to store 10 integers
        int[] numbers = new int[10];
        Random random = new Random();

        // Step 2: Generate random integers and store them in the array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // Random integers between 0 and 99
        }

        // Step 3: Print all numbers in the array
        System.out.println("Generated Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Step 4: Find the maximum and minimum values
        int max = numbers[0];
        int min = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
             if (num < min) {
                min = num;
            }
        }

        // Step 5: Print the maximum and minimum values
        System.out.println("Maximum Number: " + max);
        System.out.println("Minimum Number: " + min);
    }
}
