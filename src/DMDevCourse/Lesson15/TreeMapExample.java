package DMDevCourse.Lesson15;

import DMDevCourse.Lesson11.Person;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		Person person = new Person(1, "Jim", "Jackson");
		Person person1 = new Person(25, "Mick", "Green");
		Person person2 = new Person(16, "Louis", "Wendell");
		Person person3 = new Person(156, "Kevin", "Armstrong");
		Person person4 = new Person(48, "Jain", "Crystal");
		Person person5 = new Person(129, "Alis", "Lloyd");
		Person person6 = new Person(30, "Kristin", "Black");

		Map<Integer, Person> map = new TreeMap<>();
		map.put(person.getId(), person);
		map.put(person1.getId(), person1);
		map.put(person2.getId(), person2);
		map.put(person3.getId(), person3);
		map.put(person4.getId(), person4);
		map.put(person5.getId(), person5);
		map.put(person6.getId(), person6);
		for (Map.Entry<Integer, Person> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
	}
}
