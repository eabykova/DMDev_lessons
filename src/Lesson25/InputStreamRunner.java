package Lesson25;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamRunner {
	public static void main(String[] args) throws IOException {
//		File file = new File(String.join(File.separator,"src", "resources", "test.txt"));//before Java 1,7
		File file = Path.of("src", "resources", "test.txt").toFile();
		System.out.println(file.exists());
		try (FileInputStream fileInputStream = new FileInputStream(file)) {//during using of streams in try-with-resources
																//the stream will be closed automatically after
																//finish stream working
			//reading byte by byte:
			byte[] bytes = new byte[fileInputStream.available()];
			int count = 0;
			byte current;
			while((current = (byte)fileInputStream.read()) != -1) {
				bytes[count++] = current;
			}
			String stringValue = new String(bytes);
			System.out.println(stringValue);
			//reading by array of bytes
//			byte[] bytes = fileInputStream.readAllBytes();
//			String stringValue = new String(bytes);
//			System.out.println(stringValue);
		}
	}
}
