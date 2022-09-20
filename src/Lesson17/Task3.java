package Lesson17;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Task3 {
	public static void main(String[] args) {
		Map<String, String> person = new HashMap<>();
		person.put("Bill", "Tomas");
		person.put("Ann", "Glass");
		person.put("Nick", "Grey");
		person.put("Kail", "Lind");
		person.put("Jill", "Sky");
		person.put("Alis", "Sky");
		System.out.println("person values are unique: " + isUnique(person));
	}
	public static boolean isUnique(Map<String, String> map) {
		return map.size() == new HashSet<>(map.values()).size();
	}
}
