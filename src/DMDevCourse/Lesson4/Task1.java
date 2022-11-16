package DMDevCourse.Lesson4;

public class Task1 {
	public static void main(String[] args) {
		String val = "zero :) one :) two :( three :( four :)";
		String val1 = replace(val);
		System.out.println(val1);
	}

	public static String replace(String value) {
		return value.replace(":(", ":)");
	}

}
