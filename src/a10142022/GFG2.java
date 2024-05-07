package a10142022;

public class GFG2 {

	public static void main(String[] args) {
		try {
			String str = "123";
			int num = Integer.parseInt(str);
			System.out.println("Inside try block");
		}
//		catch (NumberFormatException ex) {
	//		System.out.println("Catch block executed");
	//	}
		finally {
		System.out.println("Outside try-catch clause");
		}
	}

}
