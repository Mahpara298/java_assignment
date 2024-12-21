public class min_max {

    public static void main(String[] args) {
        int[] numbers = {5, 9, 10, 6, 7};
        int max = findMax(numbers);
        System.out.println(max);

    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}

