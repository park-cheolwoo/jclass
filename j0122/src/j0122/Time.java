package j0122;

public class Time {
	Time(){};
	Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	};
	
	private int hour;
	private int minute;
	private int second;
	
	
	
	void setHour(int hour) {
		this.hour = hour;
	}
	
	int getHour() {
		return hour;
	}
	
	void setMinute(int minute) {
		this.minute = minute;
	}
	
	int getMinute() {
		return minute;
	}
	
	void setSecond(int second) {
		this.second = second;
	}
	
	int getSecond() {
		return second;
	}
	
	
}
