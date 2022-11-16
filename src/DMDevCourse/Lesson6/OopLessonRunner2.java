package DMDevCourse.Lesson6;

public class OopLessonRunner2 {
	public static void main(String[] args) {
		Computer laptop = new Laptop(new Ram(512), new Ssd(1000), 1700);
		Computer mobile = new Mobile(new Ram(200), new Ssd(800));

		print(laptop, mobile);
	}

	public static void print(Printable... objects) {
		for (Printable printable : objects) {
			printable.print();
			System.out.println();
		}
	}
}
