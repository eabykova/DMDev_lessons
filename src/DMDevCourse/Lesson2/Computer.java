package DMDevCourse.Lesson2;

public class Computer {
	private Ram ram;
	private Ssd ssd;

	public Computer(Ram ram, Ssd ssd) {
		this.ram = ram;
		this.ssd = ssd;
	}

	public void printState() {
		System.out.println("Computer : ram " + ram.getVal());
		System.out.println("Computer : ssd " + ssd.getVal());
	}
}
