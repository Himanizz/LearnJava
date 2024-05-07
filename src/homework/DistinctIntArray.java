package homework;

import java.util.Scanner;

public class DistinctIntArray {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        int numberOfDistinctValues = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");

        for (int i = 0; i < numbers.length; i++) {
            int value = input.nextInt();

            // Step 1: Check if value is in numbers
            boolean isDistinct = true;
            for (int j = 0; j < numberOfDistinctValues; j++) {
                if (numbers[j] == value) {
                    isDistinct = false;
                    break;
                }
            }

            // Step 2: If value is not in numbers, add it into numbers
            if (isDistinct) {
                numbers[numberOfDistinctValues] = value;
                numberOfDistinctValues++;
            }
        }

        // Step 4: Display output
        System.out.println("The number of distinct integers is " + numberOfDistinctValues);
        System.out.print("The distinct integers are [");
        for (int i = 0; i < numberOfDistinctValues; i++) {
            System.out.print(numbers[i]);
            if (i < numberOfDistinctValues - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
