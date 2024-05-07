package a05042022;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matrix = new int [5][5];
		int i = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				matrix[row][col] = i++;
			}
		}
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] % 2 == 0) {
					matrix[row][col] = 5;
				}
				System.out.println(matrix[row][col]);
			}
		}
	}
}

