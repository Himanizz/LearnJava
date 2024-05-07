package a01182024;

class IfElseTrace {
public static void main(String[] args) {
double number1 = -1.0, number2 = 4.5, number3 = -5.3, largest;
	if (number1 >= number2) {
	if (number1 >= number3) {
			largest = number1;
	}
else {
largest = number3;
	}
} else {
if (number2 >= number3) {
largest = number2;
	}
else {
largest = number3;
	}
}
System.out.println("Largest Number: " + largest);
	}
}