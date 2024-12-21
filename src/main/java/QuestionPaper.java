public class QuestionPaper {
    public static void main(String[] args) {
        // Total questions and total marks
        int totalQuestions = 15;
        int totalMarks = 100;

        // Calculate the number of 5-mark and 10-mark questions
        int y = (totalMarks - 5 * totalQuestions) / 5; // Number of 10-mark questions
        int x = totalQuestions - y; // Number of 5-mark questions

        // Output the result
        System.out.println("5 marks question is " + x);
        System.out.println("10 marks question is " + y);
    }
}
