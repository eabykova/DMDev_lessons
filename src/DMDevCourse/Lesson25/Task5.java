package DMDevCourse.Lesson25;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.APPEND;
import static java.nio.file.StandardOpenOption.CREATE;

public class Task5 {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("src", "Lesson25", "Task4.java");
		Path result = Path.of("src", "resources", "test2.txt");
		try (Stream<String> lines = Files.lines(path);
			 BufferedWriter bufferedWriter = Files.newBufferedWriter(result, APPEND, CREATE)) {
				lines.map(StringBuilder::new)
						.map(StringBuilder::reverse)
						.forEach(line -> {
							try {
								bufferedWriter.write(line.toString());
								bufferedWriter.newLine();
							} catch (IOException exception) {
								System.err.println("IOException caught into try-catch");
								exception.printStackTrace();
							}
						});
		} catch (IOException exception) {
			System.err.println("IOException caught");
			exception.printStackTrace();
		}

	}
}
