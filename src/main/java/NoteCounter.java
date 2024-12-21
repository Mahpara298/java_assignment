

import java.util.Scanner;

public class NoteCounter {
    public static void main(String[] args) {
        // Define the available notes
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        // Take user input for the amount
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        // Array to store the count of each note
        int[] noteCount = new int[notes.length];

        // Calculate the number of each note
        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                noteCount[i] = amount / notes[i]; // Calculate how many of this note
                amount = amount % notes[i];      // Remaining amount
            }
        }

        // Print the breakdown of notes
        System.out.println("Breakdown of notes:");
        for (int i = 0; i < notes.length; i++) {
            if (noteCount[i] > 0) {
                System.out.println(notes[i] + " " + noteCount[i]);
            }
        }
    }
}
