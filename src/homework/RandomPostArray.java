package homework;


import java.util.*;
public class RandomPostArray{
public static void main(String[] args)
{
	//creates a new array with 100 digits
int[] values = new int[100];
	//temp number
int number = 0;
	//random number gernerator
Random rand = new Random();
System.out.println("The randomly generated values of the array are shown below");
//Generates random numbers
for (int i = 0; i < values.length; i++)
{
values[i] = rand.nextInt(100) + 1;
number++;
}
System.out.println(number);
System.out.println(Arrays.toString(values));
int count;
//this for loop counts how many times a number has been repeated
for(int i=1;i<values.length-1;i++)
{
	// temp variable
count = 0;
//inner for loop to up count variable
for(int j=0;j<number;j++)
if(values[j]==i) count++;
if(count>0) System.out.println("The value " + i + " appears " +
count + " times");
}
}
}
