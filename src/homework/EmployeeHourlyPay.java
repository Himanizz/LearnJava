package homework;


import java.util.Scanner;

public class EmployeeHourlyPay {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     // Let's get some input from the user
     System.out.print("Enter the hourly pay: $");
     double hourlyPay = scanner.nextDouble();

     System.out.print("Enter the hours worked: ");
     int hoursWorked = scanner.nextInt();

     // Constants
     double MINIMUM_WAGE = 13.69;
     int MAX_HOURS = 60;
     int REGULAR_HOURS = 40;
     double OVERTIME_RATE = 1.5;

     // Calculate gross pay
     double grossPay;
     if (hourlyPay < MINIMUM_WAGE) {
         System.out.println("Error: Hourly pay cannot be less than the minimum wage.");
         return;
     } else if (hoursWorked > MAX_HOURS) {
         System.out.println("Error: Employee cannot work more than 60 hours in a week.");
         return;
     } else if (hoursWorked <= REGULAR_HOURS) {
         grossPay = hoursWorked * hourlyPay;
     } else {
         int regularHoursPay = REGULAR_HOURS * (int) hourlyPay;
         int overtimeHours = hoursWorked - REGULAR_HOURS;
         double overtimePay = overtimeHours * hourlyPay * OVERTIME_RATE;
         grossPay = regularHoursPay + overtimePay;
     }

     // Display the result
     System.out.println("Employee's Gross Pay: $" + grossPay);
 }
}
