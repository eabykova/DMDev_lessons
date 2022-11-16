package DMDevCourse.Lesson22;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimitiveStreamExample {
	public static void main(String[] args) {
		List<String> list = List.of("34", "42", "26", "76", "13");
		System.out.println("from IntSummaryStatistics: ");
		IntSummaryStatistics summaryStatistics = list.stream()
				.map(Integer::valueOf)
				.filter(val -> val % 2 != 0)
				.limit(2)
				.mapToInt(Integer::intValue)
				.summaryStatistics();
		System.out.println(summaryStatistics);

		System.out.println("from Stream.of: ");
		Stream.of("11", "22", "55")
				.peek(System.out::println)
				.collect(Collectors.toList())
				.forEach(System.out::println);

		//создание Stream из примитивных типов
		IntStream intStream = IntStream.of(1, 2, 3, 4, 5, 6);

		System.out.println("from IntStream.range:");
		IntStream.range(0, 5)//range создает переменные в указанном промежутке
				.forEach(System.out::println);

		System.out.println("form IntStream.Iterate:");
		IntStream.iterate(0, operand -> operand + 3)
				.skip(20)
				.limit(10)
				.forEach(System.out::println);
	}


}
