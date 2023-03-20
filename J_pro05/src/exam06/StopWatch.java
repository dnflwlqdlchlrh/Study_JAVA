package exam06;

public class StopWatch {
	
	/*
	 * +------------------+
	 * | exam06.StopWatch |
	 * +------------------+
	 * | - hour:int       |
	 * | - minute:int     |
	 * | - second:int     |
	 * +------------------+
	 * | + start():void   |
	 * | + stop():void    |
	 * | + pause():void   |
	 * | + reset():void   |
	 * +------------------+
	 */
	
	private int hour;
	private int minute;
	private int second;
	
	// setter
	public void setHour(int hour) {	
		this.hour = hour;
	}
	// getter
	public int getHour() {		
		return hour;
	}
	
	public void start() {}
	public void stop() {}
	public void pause() {}
	public void reset() {}

}
