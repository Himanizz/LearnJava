package a03312022;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "test";
		String s2 = "tset";
		char word[] = s1.toCharArray();
		Arrays.sort(word);
		char word2[] = s2.toCharArray();
		comparisim(word, word2);
		}
	 
	public static boolean comparisim (char word[], char word2[]) {
		boolean flag = false;
		for ( int i = 0; i < word.length; i++) {
				if (word[i] == word2[i]) {
					System.out.println("test");
					flag = true;
				}
				else {
					flag = false;
				}
			}
		return flag;
	 }
	}

