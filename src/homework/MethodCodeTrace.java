package homework;


public class MethodCodeTrace{
public static void main(String[] args){
int num1 = 10, num2 = 12, num3 = 7;
computeAve(num1, num2, num3);
computeSum(num1, num2, num3);
}
public static void computeAve(int x, int y, int z){
double average = (x + y + z)/3.0;
System.out.println("Average of 3 integers = " + average);
}
public static void computeSum(int x, int y, int z){
System.out.println("Sum of 3 integers = " + (x+y+z));
}
}

