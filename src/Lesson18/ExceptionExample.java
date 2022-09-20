package Lesson18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			someUnsafeFunc(3);
		} catch (FileNotFoundException e) {
			System.out.println("Value is less then zero!");
			e.printStackTrace();
		} catch (TimeoutException e) {
			System.out.println("You have cough Timeout exception");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("You have cough Exception");
			e.printStackTrace();
		} finally {
			System.out.println("This message will printed every start of the program");
		}
		System.out.println("This message will be printed");
	}
	private static void someUnsafeFunc(int val) throws FileNotFoundException, TimeoutException {
		if (val < 0) {
			throw new FileNotFoundException();
		}
		System.out.println("This message will not be printed if exception thrown");
	}
}
