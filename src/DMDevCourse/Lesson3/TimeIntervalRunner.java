package DMDevCourse.Lesson3;

public class TimeIntervalRunner {
	public static void main(String[] args) {
		TimeInterval ti = createTimeInterval();

		TimeInterval ti1 = new TimeInterval(3750);
		System.out.println("Time interval: "+ ti1.totalSeconds());

		ti.print();
		ti1.print();

		TimeInterval ti2 = ti.sum(ti1);
		ti2.print();
	}
	private static TimeInterval createTimeInterval() {
		TimeInterval timeInterval = new TimeInterval(30, 2, 1);
		System.out.println("Total seconds: " + timeInterval.totalSeconds());
		return timeInterval;
	}
}
