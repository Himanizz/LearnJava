package homework;


import java.util.Scanner;
public class DistinctCharacters{
public static void main(String[] args){
Scanner input = new Scanner(System.in);
// Changed to boolean 
boolean []chars = new boolean[256];
System.out.println("Enter the string to count the distinct characters");
String s = input.nextLine();
for (int i = 1; i <= s.length(); ++i) {
chars[s.charAt(i)] = true;
}
int count = 0;
for (int i = 0; i <= chars.length; ++i) {
if (chars[i-1]) count++;
}
System.out.println("The number of unique characters in your string is:" + count);
}
}

