package clockModel;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Time {
	private int year;
	private int month;
	private int date;
	private int hour;
	private int min;
	private TimeZone timeZone;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int day) {
		this.date = day;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public void SetTimeZone(TimeZone timeZone) {
		this.timeZone = timeZone;
	}

	public TimeZone getTimeZone() {
		return timeZone;
	}

	public long getTimeInMillis() {
		Calendar cal = Calendar.getInstance();
		if (timeZone != null) {
			cal.setTimeZone(timeZone);
		}
		cal.set(year, month, date, hour, min, 0);
		return cal.getTimeInMillis();

	}
	
	public Date toDate(){
		return new Date(getTimeInMillis());
	}

}
