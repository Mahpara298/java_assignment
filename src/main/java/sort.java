

        public class sort{
            public static void main(String[] args) {
                double[] cgpa = {3.50, 3.52, 3.43, 3.63, 3.48, 3.32, 3.30, 3.60, 3.86, 3.75};

                // Sorting the array in descending order using a simple bubble sort
                for (int i = 0; i < cgpa.length - 1; i++) {
                    for (int j = 0; j < cgpa.length - 1 - i; j++) {
                        if (cgpa[j] < cgpa[j + 1]) { // Swap if the current element is smaller than the next
                            double temp = cgpa[j];
                            cgpa[j] = cgpa[j + 1];
                            cgpa[j + 1] = temp;
                        }
                    }
                }

                // Print the sorted array
                System.out.println("CGPA scores in descending order:");
                for (double score : cgpa) {
                    System.out.print(score + " ");
                }
            }
        }






