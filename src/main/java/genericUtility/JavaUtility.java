package genericUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * This is a utility class which has functionality from Java library
 * @author QSP
 * @version 25-12-18
 */

public class JavaUtility {
	
	/**
	 * This is a utility method used to fetch the calendar value
	 * @param calendarValue
	 * @return
	 */
	
	public String getCalendarDetail(String calendarValue) {
		Calendar cal = Calendar.getInstance();
		Date date = cal.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat(calendarValue);
		String dateValue = sdf.format(date);
		return dateValue;
	}
	
	/**
	 * This is a utility method used to fetch the Random number
	 * @param boundryValue
	 * @return
	 */
	
	public int getRandomNum(int boundryValue) {
		Random r = new Random();
		int n=r.nextInt(boundryValue);
		return n;
	}

}
