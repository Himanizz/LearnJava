package a04132023;

import java.util.Arrays;

public class SentinelLinearSearch {
	public static int sentinelLinearSearch(int[] array, int key) {
		int last = array[array.length - 1];
		array[array.length - 1] = key;
		int i = 0;
		while (array[i] != key) {
			i++;
		}
		array[array.length - 1] = last;
		if (i < array.length - 1 || last == key) {
			return i;
		} else {
			return -1;
		}
	}
		  public static int search(int array[], int x)
		    {
		        int N = array.length;
		        for (int i = 0; i < N; i++) {
		            if (array[i] == x)
		                return i;
		        }
		        return -1;
		    }
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int key = 5;
		System.out.println(System.currentTimeMillis());
		int index = sentinelLinearSearch(array, key);
		System.out.println(System.currentTimeMillis());
		int index2 = search(array, key);
		System.out.println(System.currentTimeMillis());
		if (index == -1) {
			System.out.println(key + " is not found in the array: " + Arrays.toString(array));
		} else {
			System.out.println(key + " is found at index " + index + " in the array: " + Arrays.toString(array));
		}
		
		if (index2 == -1) {
			System.out.println(key + " is not found in the array: " + Arrays.toString(array));
		} else {
			System.out.println(key + " is found at index " + index2 + " in the array: " + Arrays.toString(array));
		}
	}
}
