package DMDevCourse.Lesson4;

public class Task2 {
	public static void main(String[] args) {
		String str = "one two three four five one";
		String str1 = "one two three four five six";
		String wd = "one";
		System.out.println("String 0 result: " + startEnd(str, wd));
		System.out.println("String 1 result: " + startEnd(str1, wd));
	}
	public static boolean startEnd(String string, String word) {
		return string.startsWith(word) && string.endsWith(word);
	}

}
