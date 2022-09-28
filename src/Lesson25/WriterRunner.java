package Lesson25;

import java.io.*;
import java.nio.file.Path;

public class WriterRunner {
	public static void main(String[] args) throws IOException {
		File file = Path.of("src", "resources", "writer.txt").toFile();
		try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(file, true))) {//if flag append (second param) is true al new info will be written after all info in the file
			fileWriter.append("Another one new string");
			fileWriter.newLine();
			fileWriter.append("Java the best!");
			fileWriter.newLine();
		}
	}
}
