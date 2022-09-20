package Lesson14;

import Lesson11.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortExample {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("5122", "43", "143", "56");
		System.out.println("Before sort: " + strings);
		Collections.sort(strings);
		System.out.println("After sort: " + strings);

		List<Person> people = Arrays.asList(
				new Person(1, "Vova", "Ytkin"),
				new Person(5, "Ira", "Kruglova"),
				new Person(3, "Stas", "Sevosteev"));
		System.out.println("People before sort:");
		for (Person person : people) {
			System.out.println(person.toString());
		}
		Collections.sort(people);
		System.out.println("People after sort:");
		for (Person person : people) {
			System.out.println(person.toString());
		}
		Collections.sort(people, new FirstNameComparator());
		System.out.println("People after the second sort:");
		for (Person person : people) {
			System.out.println(person.toString());
		}
	}
	public static class FirstNameComparator implements Comparator<Person> {

		@Override
		public int compare(Person o1, Person o2) {
			return o1.getFirstName().compareTo(o2.getFirstName());
		}
	}
}
