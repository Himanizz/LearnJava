package a11092022;

public class LastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "Hello World to Himani from Sneh";
boolean flag = false;
for (int i = str.length()-1; i >= 0; i--) {
		if(str.charAt(str.length()-1) == ' ' && !flag) {
			flag = true;
			continue;
		}
		if (str.charAt(i) == ' '){
			if ( flag) {
				System.out.println(str.length()-i-2);
			}
			else {
				System.out.print(str.length() - i-1);
			}
			break;
	}
}
	}

}
