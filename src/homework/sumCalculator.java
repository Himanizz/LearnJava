package homework;



public class sumCalculator {
 public static void main(String[] args) {
     // Loop 1: Sum of values from 1 to 10
     int sum1 = 0;
     for (int i = 1; i <= 10; i++) {
         sum1 += i;
         System.out.println("Sum from 1 to " + i + ": " + sum1);
     }

     // Loop 2: Sum until the total is greater than 100
     int sum2 = 0;
     int num = 1;
     while (sum2 <= 100) {
         sum2 += num;
         System.out.println("Sum until total > 100 (current value): " + sum2);
         num++;
     }
 }
}
