package Lesson24;

import java.util.List;
import java.util.OptionalDouble;

public class Task1 {
	public static void main(String[] args) {
		List<Integer> integers = List.of(1, 3, 50, 31, 40, 10, 34, 25, 90, 13);
		OptionalDouble optionalDouble = integers.stream()
				.filter(integer -> integer % 2 == 0)
				.filter(integer -> integer % 5 == 0)
				.mapToInt(Integer::intValue)
				.average();
		optionalDouble.ifPresent(System.out::println);
	}
}
