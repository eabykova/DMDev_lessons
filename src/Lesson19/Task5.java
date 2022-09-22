package Lesson19;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Task5 {
	private static Map<Integer, Throwable> EXCEPTIONS = new HashMap<>();

	public static void main(String[] args) {
		EXCEPTIONS.put(0, new RuntimeException("runtime"));
		EXCEPTIONS.put(1, new IndexOutOfBoundsException("index out of bounds"));
		EXCEPTIONS.put(2, new IOException("io"));

		Random random = new Random();
		try {
			thirdUnsafeMethod(random.nextInt(3));
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
	}

	public static void thirdUnsafeMethod(int val) throws Throwable {
		Throwable exception = EXCEPTIONS.getOrDefault(val, new NewException("new"));
		throw exception;
	}
}
