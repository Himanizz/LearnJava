package a04192022;

public class Fabonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("0");
		// System.out.println(fabonacciAdding(5, 0, 1));
		fobonacciForLoop();
	}
	public static int fabonacciAdding(int x, int a, int b) {
		//int a = 0;
		//int b = 1;
		int tot = 0;
		if (x <= 0) {
			return 1;
		}
		else {
			tot = a + b;
			System.out.println(tot);
			a = b;
			b = tot;
			return fabonacciAdding(x-1, a, b); 
		}
	}
	public static void fobonacciForLoop() {
		int a = 0;
		int b = 1;
		int tot = a + b;
		System.out.println(a);
		System.out.println(b);
		for(int i = 0; i <= 7; i++) {
			tot = a + b;
			a = b;
			b = tot;
		System.out.println(tot);
		}
	}
}
