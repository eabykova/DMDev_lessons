package DMDevCourse.Lesson25;

import java.io.*;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class ReaderRunner {
	public static void main(String[] args) throws IOException {
		File file = Path.of("src", "resources", "test.txt").toFile();
		try (BufferedReader fileReader = new BufferedReader(new FileReader(file))){
			String collect = fileReader.lines()
					.collect(Collectors.joining("\n"));
			System.out.println(collect);
		}


	}
}
