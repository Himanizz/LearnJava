package homework;

import java.util.Scanner;

public class SalesAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declare an array to store sales values (maximum 50)
        double[] sales = new double[50];
        int numberOfSales = 0;

        // Read sales values from the user
        System.out.println("Enter sales values (negative number to end input):");
        double totalSales = 0.0;
        double currentSale = input.nextDouble();

        while (currentSale >= 0 && numberOfSales < 50) {
            sales[numberOfSales] = currentSale;
            totalSales += currentSale;
            numberOfSales++;
            currentSale = input.nextDouble();
        }

        // Calculate the average
        double average = totalSales / numberOfSales;

        // Count sales above or equal to the average and below the average
        int aboveOrEqualCount = 0;
        int belowCount = 0;

        for (int i = 0; i < numberOfSales; i++) {
            if (sales[i] >= average) {
                aboveOrEqualCount++;
            } else {
                belowCount++;
            }
        }

        // Display results
        System.out.println("Average sales: " + average);
        System.out.println("Number of sales above or equal to the average: " + aboveOrEqualCount);
        System.out.println("Number of sales below the average: " + belowCount);
    }
}
