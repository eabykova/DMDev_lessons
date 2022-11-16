package DMDevCourse.Lesson25;

import java.io.File;
import java.io.IOException;

public class FileRunner {
	public static void main(String[] args) throws IOException {
		File file = new File("D:\\PROGRAMMING\\PROJECTS\\DMDev_lessons\\src\\DMDevCourse.resources\\test.txt");
		System.out.println("Before file creating");
		System.out.println("Does the file/directory exists? : " + (file.exists() ? "yes" : "no"));
		if (!file.exists()) {
			System.out.println("Creating new file: " + file.createNewFile());
			System.out.println("After file creating");
			System.out.println("Does the file/directory exists? : " + (file.exists() ? "yes" : "no"));
		}
		System.out.println("Is it directory? : " + (file.isDirectory() ? "yes" : "no"));
		System.out.println("Is it file? : " + (file.isFile() ? "yes" : "no"));
		System.out.println("Name of the file is: " + file.getName() + "; parent is: " + file.getParent());
	}
}
