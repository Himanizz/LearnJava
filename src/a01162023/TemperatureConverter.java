package a01162023;
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        // prompt the user for temperature value in Fahrenheit
        System.out.println("Enter a temperature in Fahrenheit :");
        
        // read the user input
        Scanner sc = new Scanner(System.in);
        double F = sc.nextDouble();
        
        // calculate the temperature in Celsius
        double C = (F - 32) * 5 / 9;
        
        // display the output
        System.out.println(F + " F = " + C + " C");
    }
}
