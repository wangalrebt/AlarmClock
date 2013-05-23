package clockModel;

import clockView.Observer;

public interface AlarmTimerObservable {
	public void registerObserver(Observer observer);

	public void notifyObservers();

	public void removeObserver(Observer observer);
	
}
