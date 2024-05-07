package homework;

public class TestFutureInvesment {
public static void main(String[] args) {
	//Declares Scanner
java.util.Scanner input = new java.util.Scanner(System.in);
System.out.print("Enter investment amount, for example 100: ");
//Stores users invesment amount
double investmentAmount = input.nextDouble();
System.out.print("Enter yearly interest rate, for example 5.25: ");
//stores users anual rates
double annualInterestRate = input.nextDouble();
System.out.printf("%5s%20s\n", "Years", "Future Value");
for (int i = 1; i <= 30; i++) {
	//declares method
futureInvestmentValue(investmentAmount, annualInterestRate /
1200, i);
}
}
public static void futureInvestmentValue(double investmentAmount,
double monthlyInterestRate, int numOfYears) {
	//calculates future value
double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate,
numOfYears * 12);
System.out.printf("%5d%20.2f\n", numOfYears, futureValue);
}
}
