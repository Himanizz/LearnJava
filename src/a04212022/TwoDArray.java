package a04212022;

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
				System.out.println(matrix[row][col]);
			}
		}
	}
}


