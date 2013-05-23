package clockView;

import clockModel.AlarmClockModelInterface;
import clockModel.AlarmTimer;
import clockModel.AlarmTimerInterface;

public class AlarmClockImpl implements Observer {
	private AlarmClockModelInterface alarmTimer;
	
	public AlarmClockImpl(){
		alarmTimer = new AlarmTimer();
	}
	
	public AlarmClockModelInterface getAlarmTimer(){
		return alarmTimer;
	}
	

	@Override
	public void update(AlarmTimerInterface a) {
		System.out.println("Observer...." + a.getTime().toDate());
	}

	public void setYear(int year) {
		alarmTimer.setYear(year);
	}


	public void setMonth(int month) {
		alarmTimer.setMonth(month);
	}


	public void setDay(int day) {
		alarmTimer.setDay(day);
	}


	public void setHour(int hour) {
		alarmTimer.setHour(hour);
	}


	public void setMin(int min) {
		alarmTimer.setMin(min);
	}

	public void setTimeZone(String timeZone) {
		alarmTimer.setTimeZone(timeZone);
	}


	public void save() {
		alarmTimer.save();
	}


	
	

}
