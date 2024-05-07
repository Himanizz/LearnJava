package homework;

import java.util.Scanner;

public class CollegeAdmission {
	// Main method
	public static void main(String[] args) {
		System.out.println("This program compares two applicants to determine which one seems like the stronger applicant.  \r\n"+ "For each candidate I will need either SAT or ACT scores plus a weighted GPA.");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Information for the first applicant:");
		double applicant1Score = applicant("first", scanner);
		System.out.println("Information for the second applicant:");
		double applicant2Score = applicant("second", scanner);
		reportResults(applicant1Score, applicant2Score);
		scanner.close();
	}
	// Method to handle each applicant
	public static double applicant(String applicantNumber, Scanner scanner) {
		System.out.println("Enter 1 for SAT scores or 2 for ACT scores for " + applicantNumber + " applicant:");
		int choice = scanner.nextInt();
		if (choice == 1) {
			return computeSAT(scanner) + computeGPA(scanner);
		} else {
			return computeACT(scanner) + computeGPA(scanner);
		}
	}
	// Method to compute SAT scores
	public static double computeSAT(Scanner scanner) {
		System.out.println("Enter SAT math score:");
		int math = scanner.nextInt();
		System.out.println("Enter SAT verbal score:");
		int verbal = scanner.nextInt();
		return ((2 * verbal + math) / 24.0) * 100;
	}
	// Method to compute ACT scores
	public static double computeACT(Scanner scanner) {
		System.out.println("Enter ACT English score:");
		int english = scanner.nextInt();
		System.out.println("Enter ACT math score:");
		int math = scanner.nextInt();
		System.out.println("Enter ACT reading score:");
		int reading = scanner.nextInt();
		System.out.println("Enter ACT science score:");
		int science = scanner.nextInt();
		return ((2 * reading + english + math + science) / 1.8) * 100;
	}
	// Method to compute GPA score
	public static double computeGPA(Scanner scanner) {
		System.out.println("Enter overall GPA:");
		double gpa = scanner.nextDouble();
		System.out.println("Enter maximum GPA:");
		double maxGPA = scanner.nextDouble();
		return (gpa / maxGPA) * 100;
	}
	// Method to report results
	public static void reportResults(double score1, double score2) {
		System.out.println("Applicant 1 overall score: " + score1);
		System.out.println("Applicant 2 overall score: " + score2);
		if (score1 > score2) {
			System.out.println("Applicant 1 looks better.");
		} else if (score1 < score2) {
			System.out.println("Applicant 2 looks better.");
		} else {
			System.out.println("Both applicants look equal.");
		}
	}
}
