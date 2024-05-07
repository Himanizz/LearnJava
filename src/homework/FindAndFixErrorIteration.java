package homework;


import java.io.*;
import java.util.Scanner;
public class FindAndFixErrorIteration{
public static void main (String[] args){

//It's system.in not system.input
Scanner keyboard = new Scanner(System.in);
System.out.println("Please enter numbers, each one followed by the enter/return key");
//missing a ;
System.out.println("Please type 100<enter> to exit the program");
int userNumber = 90; // anything EXCEPT 100 is good
while( userNumber != 100 ) {
System.out.println("Please type a whole number");
//its NextInt
if( !keyboard.hasNext() ) {
String junkInput = keyboard.nextLine();
System.out.println("You need to type a number. Instead, you typed " +
junkInput);
} else { // The user DID type an integer into the keyboard
keyboard.nextInt(); // get int & assign to userNumber on this line
if( userNumber < 0 ) {
	//Forgot a +
System.out.println( userNumber + " is negative!");
} else if( userNumber > 0 ) {
System.out.println( userNumber + " is positive!");
} else if( userNumber == 0 ) {
System.out.println( userNumber + " is zero!");
}
}
System.out.println("Done!");
}
}
//Had to move bracket
}

