package a10052022;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime myObj = LocalTime.now();
		System.out.println(myObj);
		LocalDateTime myObj2 = LocalDateTime.now();
		System.out.println(myObj2);
		System.out.println(myObj2.getMonthValue() + "-" +  myObj2.getDayOfMonth() + "-"+ myObj2.getYear() );
		//Date d1 = Calendar.getInstance().getTime().getTimeZone("GMT");
		DateFormat dt = new SimpleDateFormat();
		TimeZone tz = TimeZone.getTimeZone("EST");
		dt.setTimeZone(tz);
		System.out.println(dt.format(new Date()));
		

	}

}
