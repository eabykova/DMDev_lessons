package DMDevCourse.Lesson13;

import DMDevCourse.Lesson11.Person;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		Person person = new Person(1, "Jim", "Jackson");
		Person person1 = new Person(26, "Mick", "Green");
		Person person2 = new Person(17, "Louis", "Wendell");

		Map<Integer, Person> map = new LinkedHashMap<>();
		map.put(person.getId(), person);
		map.put(person1.getId(), person1);
		map.put(person2.getId(), person2);

		for (Map.Entry<Integer, Person> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
	}
}
