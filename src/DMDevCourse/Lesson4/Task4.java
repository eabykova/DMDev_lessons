package DMDevCourse.Lesson4;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Put new string here:");
		String input = scan.nextLine();
		System.out.println("Function has detected " + dotCounter(input) + " signs");
	}
	public static int dotCounter(String string) {
		String res = string.replace(".", "")
				.replace(",", "")
				.replace("!", "");
		return string.length() - res.length();
	}
}
