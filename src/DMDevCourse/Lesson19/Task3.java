package DMDevCourse.Lesson19;

public class Task3 {
	public static void main(String[] args) {
		try {
			unsafeMethod();
		} catch (NewException e) {
			System.err.println(e.getMessage());
			System.err.println(e.getCause());
			e.printStackTrace();
		}
	}

	public static void unsafeMethod() throws NewException {
		throw new NewException(new RuntimeException("runtime exception"));
	}
}
