package homework;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        // Prompt the user to enter a password
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string for password: ");
        String s = input.nextLine();
        if (isValidPassword(s)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }

    /** Check if a string is a valid password */
    public static boolean isValidPassword(String s) {
        // Check if the password:
        // 1. Has at least eight characters.
        // 2. Consists of only letters and digits.
        // 3. Contains at least two digits.
        if (s.length() < 8) {
            return false;
        }

        int digitCount = 0;
        for (char c : s.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }

        return digitCount >= 2;
    }
}
