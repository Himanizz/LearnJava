package a10192022;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearningRegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("w3schools" , Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Visit W3schools!");
		boolean matchFound = matcher.find();
		if(matchFound) {
			System.out.println("Match found.");
		}
		else {
			System.out.println("Match not found.");
		}
		

	}

}
