package a03292022;

public class SubString {

	public static void main(String[] args) {
		String pattern = "afghabcah";
		String temp = "";
		char[] patterArray=pattern.toCharArray();
		for(int i = 0; i < patterArray.length-1;i++) {
			if(pattern.charAt(i)!= pattern.charAt(i+1)){
				if(temp.contains(Character(pattern.charAt(i))))
				{
					
				}
				
				
				temp = temp + Character.toString(pattern.charAt(i));
				}
			else {
				temp = "";
				continue;
				}
			}
		System.out.print(temp);
		}
	}
		
	


