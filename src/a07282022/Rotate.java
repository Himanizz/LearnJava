package a07282022;

public class Rotate {

	public static void main(String args[]){   
		int array[] = {1,2,3,4,5,6};   
		int k  = 3;  
		int n = array.length;  
		int temp = 0;
			rotate1(array, k, n, temp);   
			System.out.println("Array after rotation: ");   
			for(int i = 0 ; i < n ; i++) {  
				System.out.print(array[i] + " ");  
					}   
	}   

	public static void rotate1(int array[], int k, int n, int temp) {   
	for (int i = 0; i < k; i++)  {
		  temp = array[ k- 1];
		for (int j = k - 1; j > 0; j--) {
			array[j] = array[j - 1];
		array[0] = temp;
				}     
			}
	}
}
		
		

	


