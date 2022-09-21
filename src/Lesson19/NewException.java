package Lesson19;

public class NewException extends RuntimeException {
	public NewException(Throwable cause) {
		super(cause);
	}

	public NewException(String message) {
		super(message);
	}
}
