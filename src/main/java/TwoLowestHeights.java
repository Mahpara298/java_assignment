
import java.util.Scanner;

public class TwoLowestHeights {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input heights of 10 babies
        double[] heights = new double[10];
        System.out.println("Enter the heights of 10 babies in cm:");
        for (int i = 0; i < heights.length; i++) {
            heights[i] = scanner.nextDouble();
        }

        // Step 2: Initialize variables to store the two lowest heights
        double lowest = Double.MAX_VALUE;
        double secondLowest = Double.MAX_VALUE;

        // Step 3: Find the two lowest heights
        for (double height : heights) {
            if (height < lowest) {
                secondLowest = lowest; // Update secondLowest before updating lowest
                lowest = height;
            } else if (height < secondLowest && height != lowest) {
                secondLowest = height; // Update secondLowest if height is less than it
            }
        }

        // Step 4: Display the results
        System.out.println("The two lowest heights are:");
        System.out.println("Lowest: " + lowest + " cm");
        System.out.println("Second Lowest: " + secondLowest + " cm");
    }
}
