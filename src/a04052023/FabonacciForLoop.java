package a04052023;

public class FabonacciForLoop {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println("0");
		// System.out.println(fabonacciAdding(5, 0, 1));
		fibonacciWhileLoop();
	}
public static void fibonacciWhileLoop() {
    int a = 0;
    int b = 1;
    int tot = a + b;
    int i = 0;
    while (i <= 7) {
        tot = a + b;
        a = b;
        b = tot;
        System.out.println(tot);
        i++;
    }
}
}




