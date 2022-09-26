package Lesson24;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
	public static void main(String[] args) {
		List<Integer> integers = List.of(1, 3, 5, 3, 2);
		String collect = integers.stream()
				.map(Object::toString)
				.collect(Collectors.joining(",", "Prefix: ", " end"));
		System.out.println("Result is: " + collect);
	}
}
