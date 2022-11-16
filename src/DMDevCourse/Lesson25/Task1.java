package DMDevCourse.Lesson25;

import java.io.IOException;
import java.util.Scanner;
import java.nio.file.Path;

public class Task1 {
	private static final String VOWELS = "aeiouy";
	public static void main(String[] args) throws IOException {
		Path path = Path.of("src", "resources", "test.txt");
		try (Scanner scanner = new Scanner(path)) {
			while(scanner.hasNext()) {
				String word = scanner.next();
				char firstChar = word.charAt(0);
				if (VOWELS.indexOf(firstChar) != -1) {
					System.out.println(word);
				}
			}
		}
	}
}
