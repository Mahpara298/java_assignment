
    import java.util.Scanner;

    public class binary_search {
        public static void main(String[] args) {
            double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

            // Step 1: Sort the array in ascending order (required for binary search)
            for (int i = 0; i < cgpa.length - 1; i++) {
                for (int j = 0; j < cgpa.length - 1 - i; j++) {
                    if (cgpa[j] > cgpa[j + 1]) { // Swap if current element is greater than the next
                        double temp = cgpa[j];
                        cgpa[j] = cgpa[j + 1];
                        cgpa[j + 1] = temp;
                    }
                }
            }

            // Step 2: Take user input
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the CGPA to search: ");
            double target = scanner.nextDouble();

            // Step 3: Binary search
            int left = 0;
            int right = cgpa.length - 1;
            boolean found = false;

            while (left <= right) {
                int mid = left + (right - left) / 2; // Avoid overflow
                if (cgpa[mid] == target) {
                    found = true;
                    break;
                } else if (cgpa[mid] < target) {
                    left = mid + 1; // Search in the right half
                } else {
                    right = mid - 1; // Search in the left half
                }
            }

            // Step 4: Display the result
            if (found) {
                System.out.println("The CGPA " + target + " is present in the array.");
            } else {
                System.out.println("The CGPA " + target + " is not present in the array.");
            }
        }
    }


