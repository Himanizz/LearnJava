package a07082022;

import java.util.Scanner;

public class TwoDArray {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][] array = new int [3][3];
		for(int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				array[row][col] = input.nextInt();
			}
		}
	for (int i = 0; i < array.length; i++) {
		for (int y = 0; y < array[i].length; y++) {
		System.out.println(array[i][y]);
				}
			}
	}
}