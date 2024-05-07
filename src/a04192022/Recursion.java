package a04192022;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		name(5);
	}
	public static int name(int n) {
		if (n <= 0) {
			return 1;
		}
		else {
			System.out.println("Himani");
			return name(n-1);
		}
	}

}
