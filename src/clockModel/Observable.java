package clockModel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import clockView.Observer;

public class Observable implements AlarmTimerObservable {
	private List<Observer> observers = new ArrayList<Observer>();
	private AlarmTimerInterface alarm;

	public Observable(AlarmTimerInterface alarm) {
		this.alarm = alarm;
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> iterator = observers.iterator();
		while (iterator.hasNext()) {
			Observer observer = iterator.next();
			observer.update(alarm);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

}
