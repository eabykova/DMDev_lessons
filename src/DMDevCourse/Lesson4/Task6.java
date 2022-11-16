package DMDevCourse.Lesson4;

public class Task6 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String val = "";
		for (int i = 0; i < 100000; i++) {
			val += i;
		}
		long finishTime = System.currentTimeMillis() - startTime;
		System.out.println("The func had work " + finishTime + " ms");

		long startTimeSB = System.currentTimeMillis();
		StringBuilder valSB = new StringBuilder("");
		for (int i = 0; i < 100000; i++) {
			valSB.append(i);
		}
		long finishTimeSB = System.currentTimeMillis() - startTimeSB;
		System.out.println("The func with StringBuilder had work " + finishTimeSB + " ms");
	}
}
