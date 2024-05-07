package a03092023;

public class Seperate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x = 98;
while(x > 9){
	x = NumberSeperate(x);
}
System.out.println(NumberSeperate(x));
	}
	   public static int NumberSeperate (int x) {
		   int sum = 0;
	        while (x > 0) {
	            int number = x % 10;
	            //System.out.println(number);
	            x = x / 10;
	            sum = sum+number;
	            
	        }
	        return sum;
	   }
	}