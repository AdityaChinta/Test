import java.util.Random;

public class PasswordGen{
    public static void main(String[] args) {
        // Static settings (no input needed)
        int length = 12;
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*";
        
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        // Loop to pick random characters from the string above
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(chars.length());
            password.append(chars.charAt(index));
        }

        System.out.println("--- Generated Secure Password ---");
        System.out.println(password.toString());
        System.out.println("---------------------------------");
    }
}