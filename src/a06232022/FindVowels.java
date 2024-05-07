package a06232022;

public class FindVowels {

	public static void main(String[] args) {
		String [] vowels = {"a","e","i","o","u"};
		String sentence = "Washington is a good state";
		int counter = 0;
		int counter1 = 0;
		int counter2 = 0;
		int counter3 = 0;
		int counter4 = 0;

		for(int i = 0; i< sentence.length(); i++) {
		
			if (sentence.charAt(i)== vowels[0].charAt(0)) {
				counter++;
				}
			if (sentence.charAt(i)== vowels[1].charAt(0)){
				counter1++;
				}
			if (sentence.charAt(i)== vowels[2].charAt(0)) {
				counter2++;
				}
			if (sentence.charAt(i)== vowels[3].charAt(0)) {
				counter3++;
				}
			if (sentence.charAt(i)== vowels[4].charAt(0)) {
				counter4++;
				}
			
			}
		 System.out.println("a.. " + counter);
			System.out.println("e.. " + counter1);
			System.out.println("i.. " + counter2);
			System.out.println("o.. " + counter3);
			System.out.println("u.. " + counter4);
		}
	public static void maximumOccurence(String sentence) {
		int temp2 = 0;
		for(int i = 0; i < sentence.length(); i++) {
			char[] charArray = sentence.toCharArray();
			if (charArray)
		}
	}
	}

