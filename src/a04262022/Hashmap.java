package a04262022;

import java.util.HashMap;

public class Hashmap {

	public static void main(String[] args) {
		int [] a = {1,2,2};
		usingHashmap(a);
	}
 public static void usingHashmap (int [] a){
HashMap <Integer, Integer> incrimintValue = new HashMap <Integer, Integer>();
	 for(int i = 0; i < a.length; i++) {
		if(incrimintValue.containsKey(a[i])) {
			int val=incrimintValue.get(a[i]);
			incrimintValue.replace(a[i], val);
		}
		else {
			incrimintValue.put(a[i], 1);
		}
	}
	 for (int x: incrimintValue.keySet()) {
			System.out.println("key: " + x + " " + "value: " + incrimintValue.get(x));
		}
 }
}
