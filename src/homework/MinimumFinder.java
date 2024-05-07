package homework;

import java.util.Scanner;

public class MinimumFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter four numbers:");
        System.out.print("First value: ");
        double firstValue = scanner.nextDouble();

        System.out.print("Second value: ");
        double secondValue = scanner.nextDouble();

        System.out.print("Third value: ");
        double thirdValue = scanner.nextDouble();

        System.out.print("Fourth value: ");
        double fourthValue = scanner.nextDouble();

        // Find the minimum value
        double minimumValue = Math.min(Math.min(firstValue, secondValue), Math.min(thirdValue, fourthValue));

        System.out.println("Minimum value is: " + minimumValue);

        scanner.close();
    }
}

