package a01222024;
public class PrintingVars {

    public static void main(String[] args) {

	// Declare a variable named firstLine, assign it the value "Hello, again!", and display that value:
        String firstLine = "Hello, again!";
        System.out.println(firstLine);


	//Display the name of a variable by put it in quotes:
        System.out.print("The value of firstLine is ");
        System.out.println(firstLine);

	//Displaying a variable is the same regardless of its type. For example:
        int hour = 11;
        int minute = 59;
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");

	//The following convert a time of day to minutes:
        System.out.print("Number of minutes since midnight: ");
        System.out.println(hour * 60 + minute);

	//Learning string concatenaton to display values with different types:
	System.out.print("Number of minutes since midnight: " + (hour * 60 + minute));

	//The following compute the fraction of an hour that has elapsed:
        System.out.print("Fraction of the hour that has passed: ");
        System.out.println(minute / 60);

	//Calculating a percentage rather than a fraction:
        System.out.print("Percent of the hour that has passed: ");
        System.out.println(minute * 100 / 60);
    }

}
