package DMDevCourse.Lesson25;

import java.io.*;
import java.nio.file.Path;

public class OutputRunner {
	public static void main(String[] args) throws IOException {
		File file = Path.of("src", "resources", "output.txt").toFile();
		try (FileOutputStream outputRunner = new FileOutputStream(file, true)) {//if we'll use "true" as the second param
			String val = "New string\n";												//new string will be written after old string
			outputRunner.write(val.getBytes());
		}
		//example with buffered stream:
		File file1 = Path.of("src", "resources", "output1.txt").toFile();
		try (BufferedOutputStream outputRunner1 = new BufferedOutputStream(new FileOutputStream(file1, true))) {
			String val1 = "New string";
			outputRunner1.write(val1.getBytes());
			outputRunner1.write(System.lineSeparator().getBytes());//lineSeparator adds the newline symbol depending on OS
		}
	}
}
