package clockModel;

public interface AlarmTimerInterface extends AlarmTimerObservable {
	public Time getTime();

	public void setTime(Time time);
	
}
