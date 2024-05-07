package a12142022;
	public class BinaryToInteger {
		  public static void main(String[] args) {
		  String b = "1001";
		  int a = 4;
		int b2 = 6;
		 System.out.println( exponential(b));
		 System.out.println(expo(a,b2));
}
		  public static int exponential (String b) {
			  double temp = 0;
			  int c = 0;
			  for(int i = b.length()-1; i >= 0; i--) {
		//		  if(b== "0") {
				 // System.out.println(b.charAt(i));
			//	  System.out.println(Math.pow(2, 0));
					  temp = temp + (Character.getNumericValue(b.charAt(i)))*Math.pow(2, c);
					  c = c+1;
					 // System.out.println(temp);
			//	  }
				//  else {
					//  temp= temp + b.charAt(i)*2^c+1;
					 // c = c+1;
				 // }
			  }
			  return (int) temp;
	}
		  public static int expo(int a, int b) {
			 int  temp = 0;
			  for( int i =0; i<= b; i++) {
				  temp = temp + a*b;
			  }
			  return temp;
		  }
	}
	