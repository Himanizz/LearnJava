package homework;

import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Base prices for tickets
        double basePriceKingCounty = 30.0;
        double basePriceOtherCounty = 40.0;

        // Input customer's age
        System.out.print("Enter customer's age: ");
        int age = scanner.nextInt();

        // Validate age
        if (age <= 0) {
            System.out.println("Error: Invalid age. Age must be greater than 0.");
            return;
        }

        // Input customer's county
        System.out.print("Enter customer's county (King or Other): ");
        String county = scanner.next();

        // Calculate ticket price based on rules
        double ticketPrice;
        if (age >= 65) {
            // Senior citizens
            ticketPrice = (county.equalsIgnoreCase("King")) ? 0.5 * basePriceKingCounty : 0.5 * basePriceOtherCounty;
        } else if (age < 5) {
            // Children under 5
            ticketPrice = 0;
        } else if (age < 14) {
            // Children under 14
            double discount = (county.equalsIgnoreCase("King")) ? 0.18 : 0.18;
            ticketPrice = (1 - discount) * basePriceKingCounty;
        } else {
            // Regular price
            ticketPrice = (county.equalsIgnoreCase("King")) ? basePriceKingCounty : basePriceOtherCounty;
        }

        // Output the result
        System.out.printf("Ticket price " +  ticketPrice);

        // Close the scanner
        scanner.close();
    }
}
