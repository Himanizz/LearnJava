package homework;

import java.util.Scanner;

public class PowerOfNumbers {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Get input from the user
     System.out.print("Enter the largest whole number (n): ");
     int n = scanner.nextInt();

     // Print column headers
     System.out.println("n\t\tn^2\t\tn^3\t\tn^4");

     // Calculate and display powers
     for (int i = 1; i <= n; i++) {
         int nSquared = i * i;
         int nCubed = nSquared * i;
         int nToFourth = nCubed * i;
         System.out.println(i + "\t\t" + nSquared + "\t\t" + nCubed + "\t\t" + nToFourth);
     }

     // Close the scanner
     scanner.close();
 }
}

