package DMDevCourse.Lesson6;

public class Mobile extends Computer {

	public Mobile(Ram ram, Ssd ssd) {
		super(ram, ssd);
	}

	@Override
	public void load() {
		System.out.println("Mobile loading...");
	}
}
