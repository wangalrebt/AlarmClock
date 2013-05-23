package clockView;

import clockModel.AlarmTimerInterface;

public class ClockView implements Observer{

	@Override
	public void update(AlarmTimerInterface a) {
		System.out.println("Observer...." + a.getTime().toDate() + " Time zone... " + a.getTime().getTimeZone().getID());
	}

}
