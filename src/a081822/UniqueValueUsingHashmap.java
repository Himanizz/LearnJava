package a081822;

import java.util.HashMap;

public class UniqueValueUsingHashmap {

	public static void main(String[] args) {
		int array [] = {1,2,3,5,6,13,3,6,1};
		HashMap <Integer, Integer> uniqueNumber = new HashMap <Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			int count = Unique (array, array[i]);
			if (count == 1) {
			uniqueNumber.put(array[i],count );
			}
		}
		for ( int x = 0; x < array.length; x++) {
		int num =Unique2(array, array[x]);
		if (num == 1) {
			System.out.println(array[x] + " = " + num);
		}
		}
	//System.out.println(uniqueNumber);
	}
	public static int Unique (int array[], int given) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			if ( array[i] == given) {
				temp = temp + 1;
			}
		}
		return temp;
		
	}
	public static int Unique2 (int array[], int num) {
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num) {
				temp = temp + 1;
			}
		}
		return temp;
	}
}
