package homework;


import java.util.Scanner;
public class SqrtGuess {
public static void main(String[] args)
{
	//creates scanner
Scanner in = new Scanner(System.in);
System.out.print("Enter a positive value and I will approximate itssquare root ");
//stores value of square root
int value = in.nextInt();
//this while loop does the math of the square root while the number is greater than 0
while(value>0)
{
System.out.printf("%d has a square root of %.2f which I estimatedas %.2f\n", value, Math.sqrt(value), mySquareRoot(value));
System.out.print("Enter a positive value and I will approximateits square root ");
value = in.nextInt();
}
}
//new method for guess check
public static double mySquareRoot(int x)
{
	//creates variables for persones guesses
double myNewGuess = 1.0, myLastGuess = 0;
//changes guesses
while(Math.abs(myNewGuess-myLastGuess)>0.01){
myLastGuess = myNewGuess;
myNewGuess = (myLastGuess + x / myLastGuess) / 2;
}
return myNewGuess;
}
}

