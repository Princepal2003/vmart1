import java.util.Random;

public class CaptchaGenerator {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final int CAPTCHA_LENGTH = 6; // You can adjust the length as needed

    public static String generateCaptcha() {
        Random random = new Random();
        StringBuilder captcha = new StringBuilder();

        for (int i = 0; i < CAPTCHA_LENGTH; i++) {
            int choice = random.nextInt(3); // Choose between character, number, or special character

            switch (choice) {
                case 0:
                    captcha.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
                    break;
                case 1:
                    captcha.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
                    break;
                case 2:
                    captcha.append(getRandomSpecialCharacter());
                    break;
            }
        }

        return captcha.toString();
    }

    public static char getRandomSpecialCharacter() {
        // Define the set of special characters you want to use
        String specialCharacters = "@#$&?";
        Random random = new Random();
        return specialCharacters.charAt(random.nextInt(specialCharacters.length()));
    }
}
