package Lesson25;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task4 {
	public static void main(String[] args) throws IOException {
		Path path = Path.of("src", "Lesson25", "Task3.java");
		String line = Files.readString(path);
		String result = line.replace("public", "private");

		Path newPath = Path.of("src","resources", "test1.txt");
		Files.writeString(newPath, result);
	}
}
