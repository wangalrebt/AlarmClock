package clockModel;

import java.util.TimeZone;

import clockView.Observer;


public class AlarmTimer implements AlarmClockModelInterface {
	private AlarmTimerImpl alarmClock;
	
	public AlarmTimer(){
		alarmClock = new AlarmTimerImpl();
	}

	@Override
	public void setYear(int year) {
		alarmClock.getTime().setYear(year);
	}


	@Override
	public void setMonth(int month) {
		alarmClock.getTime().setMonth(month - 1);
	}


	@Override
	public void setDay(int day) {
		alarmClock.getTime().setDate(day);
	}


	@Override
	public void setHour(int hour) {
		alarmClock.getTime().setHour(hour);
	}


	@Override
	public void setMin(int min) {
		alarmClock.getTime().setMin(min);
	}

	@Override
	public void setTimeZone(String timeZone) {
		alarmClock.getTime().SetTimeZone(TimeZone.getTimeZone(timeZone));
	}


	@Override
	public void save() {
		alarmClock.start();
	}


	@Override
	public void registerObserver(Observer observer) {
		alarmClock.registerObserver(observer);
	}


	@Override
	public void notifyObservers() {
		alarmClock.notifyObservers();
	}


	@Override
	public void removeObserver(Observer observer) {
		alarmClock.removeObserver(observer);
	}

	

}
