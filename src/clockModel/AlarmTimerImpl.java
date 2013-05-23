package clockModel;

import java.util.Timer;
import java.util.TimerTask;
import clockView.Observer;

public class AlarmTimerImpl extends Thread implements AlarmTimerInterface {
	private Timer timer;
	private Time time;
	private Observable observable;

	public AlarmTimerImpl() {
		observable = new Observable(this);
		timer = new Timer();
		time = new Time();
	}
	
	@Override
	public Time getTime() {
		return time;
	}

	@Override
	public void setTime(Time time) {
		this.time = time;
	}

	@Override
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	@Override
	public void notifyObservers() {
		observable.notifyObservers();
	}

	@Override
	public void removeObserver(Observer observer) {
		observable.removeObserver(observer);
	}

	@Override
	public void run() {
		timer.schedule(new AlarmTimerTask(), time.toDate());
	}

	private class AlarmTimerTask extends TimerTask {

		@Override
		public void run() {
			System.out.println("Alarm... " + time.toDate());
			timer.cancel();
			notifyObservers();
		}

	}

}
