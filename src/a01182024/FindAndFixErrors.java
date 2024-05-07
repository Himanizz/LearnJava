package a01182024;

import java.util.Scanner;
public class FindAndFixErrors{
public static void main (String[] args){
// Creating integer variable
int number;
//Creating Scanner object
Scanner input = new Scanner(System.in);
//Prompting user for an input and read it
System.out.print("Enter the number you want to check:");
number = input.nextInt();
if (number < 18); {
System.out.println("Number is less than 18 ");
	} 
if(number > 2/3); {
System.out.println("Number is greater than two third");
	} 
 {
System.out.println();
// Checking if the user input is positive
if(number > 0);
{
System.out.println(number+" is positive number");
}
}
//checking if the user input is negative
//Yes, it is possible. This is called chaining. We will talk about it in our next class
 else{
	 (number < 0) 
 }
{
System.out.println(number+" is negative number");
}
//checking if the user input is neither postive not negative
else (number == 0)
{
System.out.println(number+" is neither positive nor negative");
}
input.close();
}
}
