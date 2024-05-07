package a04052022;
import java.util.ArrayList;
import java.util.Collections;

public class ArraySum {
	public static void main(String[] args) {
		ArrayList<Integer> sum = new ArrayList<Integer>();
		//sum= {2,3,4,5,6,7};
		sum.add(1);
		sum.add(3);
		sum.add(2);
		sum.add(4);
		sum.add(6);
	int count = 0;
		
	for (int i = 0; i < sum.size(); i++) {
		count = count + sum.get(i); 
	}
	System.out.println(count);
	}
}
