import java.util.Calendar;
import java.util.TimeZone;

import clockModel.AlarmClockModelInterface;
import clockModel.AlarmTimer;
import clockView.ClockView;

public class example {
	public static void main(String[] args) {		
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		String localTimeZone = TimeZone.getDefault().getID();
		String westTimeZone = "America/Los_Angeles";
		
		//Test for local time zone and multiple alarm
		AlarmClockModelInterface clock = new AlarmTimer();
		ClockView view = new ClockView();
		clock.registerObserver(view);
		clock.setYear(year);
		clock.setMonth(month);
		clock.setDay(day);
		clock.setHour(hour);
		clock.setMin(min);
		clock.setTimeZone(localTimeZone);
		clock.save();

		//Test for local time zone and multiple alarm
		clock = new AlarmTimer();
		clock.registerObserver(view);
		clock.setYear(year);
		clock.setMonth(month);
		clock.setDay(day);
		clock.setHour(hour);
		clock.setMin(min+1);
		clock.setTimeZone(localTimeZone);
		clock.save();

		//Test for local time zone and multiple alarm
		clock = new AlarmTimer();
		clock.registerObserver(view);
		clock.setYear(year);
		clock.setMonth(month);
		clock.setDay(day);
		clock.setHour(hour);
		clock.setMin(min+2);
		clock.setTimeZone(localTimeZone);
		clock.save();
		
		//Test for us west time zone which is equal to local time zone at 2 minutes later and multiple alarm
		clock = new AlarmTimer();
		clock.registerObserver(view);
		clock.setYear(year);
		clock.setMonth(month);
		clock.setDay(day);
		clock.setHour(hour-3);
		clock.setMin(min+2);
		clock.setTimeZone(westTimeZone);
		clock.save();
	}

}
