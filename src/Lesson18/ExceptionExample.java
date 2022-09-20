package Lesson18;

import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			someUnsafeFunc(-3);
		} catch (FileNotFoundException e) {
			System.out.println("Value is less then zero!");
			e.printStackTrace();
		}
		System.out.println("This code will be executed");
	}
	private static void someUnsafeFunc(int val) throws FileNotFoundException {
		if (val < 0) {
			throw new FileNotFoundException();
		}
		System.out.println("This code will not be executed if exception thrown");
	}
}
