package a04052022;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {
		HashMap<String, Integer> practice = new HashMap<String, Integer>();
		practice.put("Kyra", 1);
		practice.put("Sneh", 2);
		practice.put("Kumar", 3);
		practice.put("Himani", 4);
		practice.put("Rupika", 5);
	for(String i: practice.keySet()) {
		System.out.println(i);
	}

	}

}
