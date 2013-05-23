package clockModel;

import clockView.Observer;


public interface AlarmClockModelInterface {

	public abstract void setYear(int year);

	public abstract void setMonth(int month);

	public abstract void setDay(int day);

	public abstract void setHour(int hour);

	public abstract void setMin(int min);

	public abstract void setTimeZone(String timeZone);

	public abstract void save();
	
	public void registerObserver(Observer observer);

	public void notifyObservers();

	public void removeObserver(Observer observer);

}