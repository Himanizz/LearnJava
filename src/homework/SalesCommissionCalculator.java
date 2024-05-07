package homework;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sales amount: $");
        double salesAmount = scanner.nextDouble();

        double commission = calcCommission(salesAmount);

        System.out.println("Commission amount: $" + commission);

        scanner.close();
    }

    public static double calcCommission(double salesAmount) {
        double commission;
        if (salesAmount <= 5000) {
            commission = salesAmount * 0.08;
        } else if (salesAmount <= 10000) {
            commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
        } else {
            commission = 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;
        }
        return commission;
    }
}
