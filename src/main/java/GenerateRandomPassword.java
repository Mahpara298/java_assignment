
import java.util.Random;

public class GenerateRandomPassword {

    public static void main(String[] args) {
        // Character sets
        String digits = "0123456789";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String specialChars = "!@#$%&";
        String allChars = digits + upperCase + lowerCase + specialChars;

        // Random generator
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        // Ensure at least one character from each set
        sb.append(digits.charAt(random.nextInt(digits.length())));
        sb.append(upperCase.charAt(random.nextInt(upperCase.length())));
        sb.append(lowerCase.charAt(random.nextInt(lowerCase.length())));
        sb.append(specialChars.charAt(random.nextInt(specialChars.length())));

        // Fill remaining characters from the full set
        for (int i = 4; i < 8; i++) {
            sb.append(allChars.charAt(random.nextInt(allChars.length())));
        }

        // Shuffle to randomize positions
        char[] password = sb.toString().toCharArray();
        for (int i = 0; i < password.length; i++) {
            int randomIndex = random.nextInt(password.length);
            char temp = password[i];
            password[i] = password[randomIndex];
            password[randomIndex] = temp;
        }

        // Print the generated password
        System.out.println("Generated Password: " + new String(password));
    }
}
