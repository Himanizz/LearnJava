package a09062022;

import java.util.Arrays;

public class Order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {2,6,4,10};
		orderingNumbers(array);
	}

	public static int orderingNumbers(int array[]) {
		int temp = 0;
		for (int i = 0; i < array.length; i++ ) {
			for(int x = i; x < array.length; x++) {
				if(array[i]>array[x]) {
					temp = array[i];
					array[i] = array[x];
					array[x] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
		return 0;
		
	}
}
