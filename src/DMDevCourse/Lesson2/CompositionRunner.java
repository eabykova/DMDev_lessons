package DMDevCourse.Lesson2;

public class CompositionRunner {
	public static void main(String[] args) {
//		Ram ram = new Ram(512);
		Computer computer = new Computer(new Ram(512), new Ssd(1024));
		computer.printState();
	}
}
