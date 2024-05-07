package a04052022;
import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {
		 ArrayList<String> name = new ArrayList<String>();
		 name.add("Himani");
		 name.add("Rupika");
		 name.add("Kumar");
		 name.add("Sneh");
		 name.add("Kyra");
		int find = name.indexOf("Kumar");
		name.set(find, "abc");
		for (String i: name) {
			System.out.println(i);
		}

	}

}
