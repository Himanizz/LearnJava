package a06192022;

import java.util.ArrayList;

public class DuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num [] = {2,2,7,4,5,5,9,1,1,10};
		ArrayList temp = new ArrayList();
		for (int i = 0; i < num.length; i++) {
			if(temp.contains(num[i])) {
			//temp.contains(num[i]);
			}
			else {
				temp.add(num[i]);
			}
	
		}
		System.out.println(temp);
	}

}
