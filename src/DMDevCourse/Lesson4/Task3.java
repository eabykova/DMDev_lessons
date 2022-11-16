package DMDevCourse.Lesson4;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
//		String fullName = "John August Smith";
		System.out.println("Put your full name here:");
		Scanner scan = new Scanner(System.in);
		String fullName = scan.nextLine();
		String res = initials(fullName);
		System.out.println("Initials: " + res);
	}

	public static String initials (String fullName) {
		fullName = fullName.toUpperCase();
		String[] arrN = fullName.split(" ");
//		char[] res = {0, 0, 0};
//		for (int i = 0; i < arrN.length; i++) {
//			res[i] = arrN[i].charAt(0);
//		}
//		return String.format("%s.%s.%s.", res[0], res[1], res[2]);
		char fnc = Character.toUpperCase(arrN[0].charAt(0));
		char lnc = Character.toUpperCase(arrN[1].charAt(0));
		char pnc = Character.toUpperCase(arrN[2].charAt(0));
		return String.format("%s.%s.%s.", fnc, lnc, pnc);
	}
}
