package a11162022;

public class AdditionUsingRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int result = sum(5, 10);
	    System.out.println(result);
	  }
	  public static int sum(int start, int end) {
	    if (end > start) {
	      return end + sum(start, end - 1);
	    } else {
	      return end;
	    }
	  }
	}
	
