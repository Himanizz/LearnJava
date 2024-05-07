package a07282022;

public class LastWord {

	public static void main(String[] args) {
		String s = "Good job";
		int lastWordLength = s.length();
		for ( int i = lastWordLength - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
			if (' ' == s.charAt(i)) {
				break;
			}
		}
	}

}
