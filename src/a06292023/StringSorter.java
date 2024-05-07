package a06292023;

import java.util.Arrays;

public class StringSorter {
    public static String sortStringByLetter(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "success";
        String sortedString = sortStringByLetter(input);
        System.out.println("Sorted string: " + sortedString);
    }
}