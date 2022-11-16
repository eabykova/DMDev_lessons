package DMDevCourse.Lesson1;

import static java.lang.Thread.sleep;

public class Computer {
	private int	ssd = 512;
	private int	ram = 1024;

	void load() throws InterruptedException {
		System.out.println("Loading....");
		sleep(1000);
		System.out.println("Computer is ready");
	}
	public int getSsd() {
		return this.ssd;
	}
	public int getRam() {
		return this.ssd;
	}
}
