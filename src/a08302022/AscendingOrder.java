package a08302022;

import java.util.HashMap;


public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <String, Integer> name = new HashMap <String, Integer>();
		name.put("Ram", 4);
		name.put("Sita", 10);
		name.put("Mike",2);
		name.put("James",3);
		System.out.println(ComparingValues(name));
	}
public static int ComparingValues (HashMap<String,Integer> name) {
	int temp = 0;
	for(String i: name.keySet()) {
		int getI = name.get(i);
		for(String x: name.keySet()){;
		int getX = name.get(x);
		if (getI > getX) {
			temp = getI;
			getI = getX;
			getX = temp;
			
				}
			}
		}
	System.out.println(name.toString());
	return 0;	
	}
}
