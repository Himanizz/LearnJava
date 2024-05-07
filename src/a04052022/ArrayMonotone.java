package a04052022;

import java.util.ArrayList;

public class ArrayMonotone {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(3);
		num.add(4);
		num.add(5);
		num.add(6);
boolean name = false;
for (int i = 1; i < num.size(); i++) {
	if (num.get(i) > num.get(i-1)) {
		name = true;
	}
	else {
		name = false;
	}
}
System.out.println(name);
	}
}


