package a04262022;

public class SecondHighestandLowest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = { 5, 2, 1, 13, 0, 20, 45 };
		System.out.println("Second Highest:" + getSecondHighest(a, a.length));
		System.out.println("Second Lowest:" + getSecondLowest(a, a.length));
	}

	public static int getSecondHighest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total - 1; i++) {
			for (int x = i + 1; x < total; x++) {
				if (a[i] > a[x]) {
					temp = a[i];
					a[i] = a[x];
					a[x] = temp;
				} 
			}
		}
		return a[total - 2];
	}
	public static int getSecondLowest(int[] a, int total) {
		int temp;
		for (int i = 0; i < total - 1; i++) {
			for (int x = i + 1; x < total; x++) {
				if (a[i] < a[x]) {
					temp = a[i];
					a[i] = a[x];
					a[x] = temp;
				}
			}
		}
		return a[total - 2];
	}
}

