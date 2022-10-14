package Lesson26;

import java.io.*;
import java.nio.file.Path;

public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Path file = Path.of("src", "resources", "persons.txt");
//		writeObject(file);
		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file.toFile()))) {
			Object object = objectInputStream.readObject();
			System.out.println(object);
		}
	}

	private static void writeObject(Path file) throws IOException {
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file.toFile()))) {
			Person bill = new Person(34, "Bill");
			objectOutputStream.writeObject(bill);
		}
	}
}
