package DMDevCourse.Lesson21;

import java.util.List;

public class SteamExample {
	public static void main(String[] args) {
		//Example of stream since Java 1.8
		List<String> strings = List.of("1", "20", "12", "5", "32");
		strings.stream()//открытие потока для обраотки коллекции
				.map(string -> string + string)
				.map(Integer::valueOf)
				.filter(val -> val % 2 == 0)
				.forEach(System.out::println);
		System.out.println();

		List<String> strings1 = List.of("1", "20", "12", "5", "32");
		method(strings1);
	}
	//Example in simple methods from Java before 1.8:
	public static void method(List<String> strings) {
		for (String string : strings) {
			String val = string + string;
			int intVal = Integer.parseInt(val);
			if (intVal % 2 == 0) {
				System.out.println(intVal);
			}
		}
	}
}
