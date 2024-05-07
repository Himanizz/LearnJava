package homework;



import java.util.*;
public class FindAndFixErrorMethod{
public static void main(String[] args) {
Scanner in=new Scanner(System.in);
System.out.print("Enter a String and I will tell you the number ofoccurrences of every letter ");
//Removed String
String temp = in.next();
//Added a number
int count = 0;
for(char c='a';c<='z';c++)
{
countOccurrences(count, temp);
}
}
public static void countOccurrences(int count, String temp2)
{
	//Changed it so it would be a string rather than an integer
String temp = temp2;
for(int i=0;i<temp.length();i++)
{
//Don't change it into a char
if(temp2==temp) {
	count++;
}
}
if(count>0) System.out.println(temp2 + " appears " + count + " times");
}
}
