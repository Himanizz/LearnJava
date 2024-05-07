package a11302022;

import java.util.Scanner;

public class IntegerSegragation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int []arr = new int [20];
		for(int i = 0; i < 20; i++) {
			System.out.println("Please enter an integer.");
			int x = console.nextInt();
			arr[i] = x;
		}
		negative(arr);
		zero(arr);
		postive(arr);
		evenodd(arr);
	}
	public static void negative(int[]arr) {
		int temp = 0;
		for( int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				temp = temp+1;
			}
		}
		System.out.println("There are " + temp + " negative numbers.");
	}
	
	public static void zero(int[]arr) {
		int temp = 0;
		for( int i = 0; i < arr.length; i++) {
			if(arr[i]%10 == 0) {
				temp = temp+1;
			}
		}
		System.out.println("There are " + temp + " zeros.");
	}
	
	public static void postive(int[] arr) {
		int temp = 0;
		for( int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				temp = temp+1;
			}
		}
		System.out.println("There are " + temp + " postive numbers.");
	}
	public static void evenodd(int arr[]) {
		int temp = 0;
		int temp2 = 0;
		for( int i = 0; i < arr.length; i++) {
			if(arr[i]/2 == 0) {
				temp = temp+1;
			}
			else {
				temp2 = temp2+1;
			}
		}
		System.out.println("There are " + temp + " even numbers.");
		System.out.println("There are " + temp + " odd numbers.");
	}
}
