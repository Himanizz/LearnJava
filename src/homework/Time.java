package homework;

public class Time {
    public static void main(String[] args) {
        // Step 2: Create variables for hour, minute, and second
        int hour = 14; // 2 p.m. in 24-hour format
        int minute = 30;
        int second = 45;

        // Step 3: Calculate seconds since midnight
        int secondsSinceMidnight = (hour * 3600) + (minute * 60) + second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);

        // Step 4: Calculate seconds remaining in the day
        int totalSecondsInDay = 24 * 3600;
        int remainingSeconds = totalSecondsInDay - secondsSinceMidnight;
        System.out.println("Seconds remaining in the day: " + remainingSeconds);

        // Step 5: Calculate percentage of the day passed (using floating-point)
        double percentagePassed = (secondsSinceMidnight * 100.0) / totalSecondsInDay;
        System.out.println("Percentage of the day passed: " + percentagePassed + "%");

        // Step 6: Calculate elapsed time since starting this exercise
        int currentHour = 18; // Update with the current hour
        int currentMinute = 45; // Update with the current minute
        int currentSecond = 0; // Update with the current second

        int elapsedSeconds = ((currentHour - hour) * 3600) + ((currentMinute - minute) * 60) + (currentSecond - second);
        System.out.println("Elapsed time since starting this exercise: " + elapsedSeconds + " seconds");
    }
}
