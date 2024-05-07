package homework;

import java.util.Scanner;

public class LoanPayment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get loan details from the user
        System.out.print("How much was the original loan? $");
        double amount = scanner.nextDouble();

        System.out.print("What is the annual interest rate (in percentage)? ");
        double rate = scanner.nextDouble();
        rate /= 100.0; // Convert to decimal

        // Constants
        final double MINIMUM_INTEREST_RATE = 0.05;
        final double MONTHS_IN_YEAR = 12.0;

        // Initialize variables
        double totalPay = 0;
        int count = 0;

        // Calculate and track payments
        while (amount > 0) {
            // Calculate monthly interest
            double monthlyInterest = (amount * rate) / MONTHS_IN_YEAR;

            // Output current amount
            System.out.println("Current loan amount: $" + amount);

            // Compute minimum payment
            double minimumPayment = MINIMUM_INTEREST_RATE * amount;
            System.out.println("Minimum payment for the month: $" + minimumPayment);

            // Prompt for monthly payment
            System.out.print("Enter your monthly payment: $");
            double thisMonth = scanner.nextDouble();

            // Verify that monthly payment is at least the minimum
            while (thisMonth < minimumPayment) {
                System.out.print("That is not enough! You must pay at least $" + minimumPayment + ". Try again: $");
                thisMonth = scanner.nextDouble();
            }

            // Deduct payment from remaining amount
            amount -= thisMonth;

            // Update total payment and count
            totalPay += thisMonth;
            count++;
        }

        // Calculate average payment
        double average = (count > 0) ? totalPay / count : 0;

        // Print results
        System.out.println("\nTotal payments made: $" + totalPay);
        System.out.println("Number of payments: " + count);
        System.out.println("Average payment per month: $" + average);

        // Close the scanner
        scanner.close();
    }
}

