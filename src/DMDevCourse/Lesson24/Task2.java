package DMDevCourse.Lesson24;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
	public static void main(String[] args) {
		List<String> strings = List.of(
				"hhhhhhhhhhh",
				"sssssssssssss",
				"aaaaaaaaaaaa",
				"aaaaaaaaaaaa",
				"bbbbbbbbbbbbb");
		//example 1:
		int uniqueSize = strings.stream()
				.filter(val -> val.length() > 8)
				.collect(Collectors.toSet())
				.size();
		System.out.println("example 1: " + uniqueSize);

		//example 2:
		long uniqueSize1 = strings.stream()
				.filter(val -> val.length() > 8)
				.distinct()//убираем все дубликаты строк из коллекции
				.count();
		System.out.println("example 2: " + uniqueSize1);

	}
}
