package Lesson24;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Task5 {
	public static void main(String[] args) {
		List<Person> people = List.of(
				new Person(25, "Bill", "Milligan"),
				new Person(58, "Liz", "Kollins"),
				new Person(41, "Ann", "Jameson"),
				new Person(15, "Antony", "Edwards")
		);
		people.stream()
				.filter(person -> person.getFullName().length() < 15)
				.max(Comparator.comparing(Person::getAge))
				.map(Person::getFullName)
				.ifPresent(System.out::println);
		Map<Integer, List<Person>> collect = people.stream()
				.collect(Collectors.groupingBy(Person::getAge));
		System.out.println(collect);
	}
}
