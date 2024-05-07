package a04192022;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumOfFive(5));
		
	}
public static int sumOfFive(int x) {
	if(x<= 0) {
		return 1;
	}
	else {
		return x + sumOfFive(x-1);
	}
}
}
