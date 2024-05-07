package a01222024;

import java.util.Scanner;

public class Assignment_2 {
	public static void main(String[] args) {
	      Scanner in=new Scanner(System.in);
	      
	      // Statement asks for the user's name
	      			System.out.print("What's your name: ");
	      			// Variable stores user's full name
	      				String name = in.next();
	      			
	      //	Statement asks for the user's price per gallon		
	      			System.out.print("What's the price per gallon: ");
	      			// Variable stores price per gallon
	      				double gallon = in.nextDouble();
	      			
	      // Statement asks for the total 
	      			System.out.print("What's the total price for fillup: ");
	      			// Variable stores the total
	      				double price = in.nextDouble();
	      			
	      // Statement asks for the user's initial odometer value	
	      			System.out.print("What's your initial odometer value: ");
	      			// Variable stores value
	      				int initial = in.nextInt();
	      			
	      // Statement asks user's final odometer value
	      			System.out.print("Whats your final odometer value: ");
	      			// Variable stores value
	      				int fin = in.nextInt();
	      			
	      // Variable stores total gallons
	      		double totalGallon = price/gallon;
	      		
	      //Variable stores totals miles
	      		int miles = fin - initial;
	      		
	      // Variable stores mpg
	      		double mpg = miles/totalGallon;
	      		
	      //Statement prints out an extra line to space out the final statement
	      		System.out.println();
	      			
// Statement prints user's final statistics
System.out.println(name +", you drove " + miles + " miles using " + totalGallon + " gallons with a mpg " + mpg);
			}
}
