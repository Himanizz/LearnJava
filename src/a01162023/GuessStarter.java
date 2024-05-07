package a01162023;

import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;

        // prompt the user
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(including both). Can you guess what it is?");
        System.out.println("Type a number:");

        // read the user input
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        // display the result
        System.out.println("Your guess is: " + guess);
        System.out.println("The number I was thinking of is: " + number);

        // compute and display the difference
        int difference = guess - number;
        System.out.println("You were off by: " + difference);
    }
}
