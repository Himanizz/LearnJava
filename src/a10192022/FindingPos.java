package a10192022;

import java.util.Arrays;
import java.util.Scanner;

public class FindingPos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner number = new Scanner(System.in);
		System.out.println("Please select a number to add into the array");
		int x = number.nextInt();
		int [] nums = {1,3,5,6};
		int y = nums.length;
		int[] newArray=new int [nums.length+1];
		for (int i = 0; i < y; i++) {
			newArray[i] = nums[i];
		}
		newArray[y] = x;
		Arrays.sort(newArray);
		for (int z = 0; z < newArray.length; z++) {
			if (newArray[z] == x){
				System.out.println(x + " is in the " + z + " position." );
				break;
			}
		}
	}

}
