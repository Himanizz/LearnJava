package a06032023;

public class ConsecutiveLetters {
    public static void printConsecutiveLetters(String str) {
        char previousChar = '\0';
        for (char currentChar : str.toCharArray()) {
            if (currentChar == previousChar) {
                System.out.println(Character.toString(currentChar) + Character.toString(previousChar));
            } 
            else {
                previousChar = currentChar;
            }
        }
    }

    public static void main(String[] args) {
        String input = "success";
        System.out.println("Consecutive letters: ");
        printConsecutiveLetters(input);
    }
}
