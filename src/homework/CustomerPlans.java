package homework;


import java.util.Scanner;
public class CustomerPlans{
public static void main(String[] args){
	//Creates variables for the code
int minutes;
double cost = 0.0;
char customerType;
//Creates scanner
Scanner input = new Scanner(System.in);
//Asks the users questions for things that are needing input
System.out.println("Are you a residential or commercial customer? ");
System.out.println("type res for residential or com for commercial");
customerType = input.next().toLowerCase().charAt(0);
//If they are a residential or commercial customer ask them how many mins used for the week
if(customerType == 'r' || customerType == 'c'){
System.out.println("Enter the number of minutes used for the week");
//Creates minute variable
minutes = input.nextInt();
int extalMinR = minutes - 60;
int extralMinC = minutes - 300;
//if customer is a residential type and they use less than or equal to 60 minutes their cost it 5 dollars
if (customerType == 'r' && minutes <= 60){
cost = 5 ;
}
//Else their cost is 5 dollars plus .1* extalMinR
else {
cost = 5 + (0.1 * extalMinR);
}
//If customer type is commercial and they use less than or equal to 300 minutes, their cost is 300*.2
if(customerType == 'c' && minutes <= 300){
cost = 300 * 0.2;
}
// Else if they are not a residential and they used more than 300 minutes, their cost is 300*.2 with an additional .15*how ever many more minutes
else if(customerType != 'r') {
cost = (300 * 0.2) + (0.15 * extralMinC);
}
//Prints details
System.out.print("Customer Type: " + customerType);
System.out.print(", Total minutes used = " + minutes);
System.out.printf(", and your total cost = $%.2f", cost );
//System.out.println(", and your total cost = " + cost);
System.out.println();
}
else {
System.out.println("Error: Invalid input. Try again!!");
}
}
}
