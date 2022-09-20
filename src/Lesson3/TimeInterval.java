package Lesson3;

public class TimeInterval {
	private static final int SEC_IN_MIN = 60;
	private static final int MIN_IN_HOUR = 60;
	private static final int SEC_IN_HOUR = 3600;
	private int	seconds;
	private int	minutes;
	private	int hours;

	public TimeInterval(int seconds, int minutes, int hours) {
		this.seconds = seconds;
		this.minutes = minutes;
		this.hours = hours;
	}

	public int totalSeconds() {
		return seconds + minutes * SEC_IN_MIN + hours * SEC_IN_MIN * MIN_IN_HOUR;
	}

	public TimeInterval(int totalSeconds) {
		this.hours = totalSeconds / SEC_IN_MIN / MIN_IN_HOUR;
		this.minutes = totalSeconds % SEC_IN_HOUR / SEC_IN_MIN;
		this.seconds = totalSeconds % SEC_IN_HOUR % SEC_IN_MIN;

	}

	public void print() {
		System.out.println("H: " + hours + ", M: " + minutes + ", S: " + seconds);
	}

	public TimeInterval sum(TimeInterval second) {
		return new TimeInterval(this.totalSeconds() + second.totalSeconds());
	}

	public int getSeconds() {
		return seconds;
	}

	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}

	public int getMinutes() {
		return minutes;
	}

	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
}
