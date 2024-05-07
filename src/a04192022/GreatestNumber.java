package a04192022;

public class GreatestNumber {

	public static void main(String[] args) {
		int[]newArray = {12, 10, 15, 80, 100}; 
		sorter(5, newArray);
	}
	public static int sorter (int n, int[] newArray) {
		int temp = 0;
		if (n == 1) {
			return newArray[0];
		}
		else {
			if( temp < newArray[n-1]) {
			temp = newArray[n-1];
			}
			System.out.println(temp);
			return sorter(n-1,newArray);
		}
	}

}
