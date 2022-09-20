package Homework2;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Put new string here:");
		String input = scan.nextLine();
		System.out.println("The string is palendrom: " + isPalendrom(input));
	}
	public static boolean isPalendrom(String str) {
		StringBuilder dub = new StringBuilder(str);
		dub.reverse();
		return str.equals(dub.toString());
	}
}
