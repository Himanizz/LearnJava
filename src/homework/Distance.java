package homework;

public class Distance {
	public static void main(String[] args) {
		int array[] = {2,3,4,1,5,6,3,11,12};
		distanceOne(array);
	}
	public static boolean distanceOne (int array[]) {
		int temp = 0;
		for( int i =0; i < array.length; i++) {
			for( int x = i + 1; x < array.length; x++) {
			if ( array[i] == array[x]) {
				temp = array[i];
				}
			System.out.println(x+1-i);
			}
		}
		//distanceTwo(array,temp);
		return true;
		
	}
	
	public static boolean distanceTwo(int array[], int temp) {
		int temp2 = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == temp) {
				for(int x = temp+1; x < temp; x++) {
					temp2 = x;
				}
			}
		}
		//System.out.println(temp2);
		return true;
	}
}
