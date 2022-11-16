package DMDevCourse.Lesson1;

public class ComputerRunner {
	public static void main(String[] args) {
		DMDevCourse.Lesson1.Computer computer = new DMDevCourse.Lesson1.Computer();
		try {
			computer.load();
		} catch (InterruptedException e) {
			System.out.println("Error in loading");
		}
		System.out.println("RAM: " + computer.getRam());
		System.out.println("SSD: " + computer.getSsd());
	}
}
