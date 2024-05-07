package a12072022;

import java.util.ArrayList;

public class Bianary {
	public static void main(String[] args) {
	convertToBianary();
	}
	public static void convertToBianary() {
		int num =9; 
		int q = 0;
		int r = 0;
		ArrayList<Integer> bianary = new ArrayList<Integer>();
		while (num > 0) {
			q = num/2;
			r = num%2;
			num = q;
			bianary.add(r);
		}
		System.out.println(bianary);
	}
}

  