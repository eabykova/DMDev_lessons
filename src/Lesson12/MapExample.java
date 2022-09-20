package Lesson12;

import Lesson11.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		Person person = new Person(1, "Jim", "Jackson");
		Person person1 = new Person(2, "Mick", "Green");
		Person person2 = new Person(1, "Louis", "Wendell");

		Map<Integer, Person> map = new HashMap<>();
		map.put(person.getId(), person);
		map.put(person1.getId(), person1);
		map.put(person2.getId(), person2); //значение, добавленное ранее перетирается новым значением с идентичным ключом
		map.putIfAbsent(person2.getId(), person2); //putIfAbsent решает проблему перетирания ранее существующей пары K-V

		System.out.println("Info about person: " + map.get(2));
		System.out.println("Set of keys: " + map.keySet());
		System.out.println("Lots of values: " + map.values());
		System.out.println("Entry set: " + map.entrySet());
		System.out.println("map contains key 3: " + map.containsKey(3));
		System.out.println("map size: " + map.size());
		System.out.println("Is the map empty? : " + map.isEmpty());
		System.out.println("Info about person: " + map.getOrDefault(5, person));//если нет запрашиваемого по ключу значения, возвращает значение, указанное вторым аргументом

		for (Map.Entry <Integer, Person> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "   " + entry.getValue());
		}
	}
}
