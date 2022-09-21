package Lesson19;

public class Task4 {
	public static void main(String[] args) {
		try {
			customException();
		} catch (NewException e) {
			System.err.println("Catch in main!");
			e.printStackTrace();
		}
	}

	public static void customException() {
		try {
			secondUnsafeMethod();
		} catch (RuntimeException e) {
			System.err.println("Catch into customException");
			throw new NewException(e);
		}
	}

	public static void secondUnsafeMethod() {
		throw new RuntimeException("runtime exception");
	}
}
