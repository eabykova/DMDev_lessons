package DMDevCourse.Lesson28;

public class SimpleThread extends Thread {
	@Override
	public void run() {
		System.out.println("Hello from " + getName() + " thread");
	}
}
