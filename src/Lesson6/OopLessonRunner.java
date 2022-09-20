package Lesson6;

public class OopLessonRunner {
	public static void main(String[] args) {
		Computer laptop = new Laptop(new Ram(512), new Ssd(1000), 1700);
		Computer mobile = new Mobile(new Ram(200), new Ssd(800));
		loadComputers(laptop, mobile);
	}
	public static void loadComputers(Computer... computers) {
		System.out.println("Loading all computers:");
		for (Computer computer : computers) {
			if (computer instanceof Laptop)
				((Laptop) computer).open();
			else
				computer.load();
			System.out.println();
		}
	}
	public static void printComputers(Computer... computers) {
		System.out.println("Info about all computers:");
		for (Computer computer : computers) {
			computer.print();
			System.out.println();
		}

	}
}
