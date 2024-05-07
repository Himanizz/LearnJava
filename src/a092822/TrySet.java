package a092822;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class  TrySet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> names = new HashSet <>();
		names.add("Tom");
		names.add("Mary");
		names.add("Peter");
		names.add("Alice");
		if(names.add("James")) {
			System.out.println("James is added to the set.");
			}
		if(names.remove("James")) {
			System.out.println("James is removed from the set.");
			}
		if (names.isEmpty()) {
		    System.out.println("The set is empty");
			} 
		else {
		    System.out.println("The set is not empty");
			}
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
		    String name = iterator.next();
		    System.out.println(name);
		}
		Set<Integer> s1 = new HashSet<>(Arrays.asList(20, 56, 89, 31, 8, 5));
		Set<Integer> s2 = new HashSet<>(Arrays.asList(8, 89));
		 
		if (s1.containsAll(s2)) {
		    System.out.println("s2 is a subset of s1");
		}
		s1.addAll(s2);
		System.out.println(s1);
		
		Set<Integer> s3 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 7, 9));
		Set<Integer> s4 = new HashSet<>(Arrays.asList(2, 4, 6, 8));
		 
		System.out.println("s1 before intersection: " + s3);
		 
		s3.retainAll(s4);
		 
		System.out.println("s1 after intersection: " + s4);
	}
}
