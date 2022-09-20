package Lesson19;

public class Task1 {
	public static void main(String[] args) {
		String str = null;
		try {
			System.out.println(str.length());
		} catch (NullPointerException e) {
			System.err.println("String does not exist");
			e.printStackTrace();
		}
	}
}
