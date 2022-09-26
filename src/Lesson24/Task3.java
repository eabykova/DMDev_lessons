package Lesson24;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
	public static void main(String[] args) {
		Map<String, Integer> map = Map.of(
				"aaaaa", 23,
				"bbbbbb", 34,
				"cc", 84,
				"ddddddddd", 45,
				"kkkkkkk", 32,
				"fff", 40
		);
		int valSum = map.entrySet().stream()
				.filter(entry -> entry.getKey().length() < 7)
				.mapToInt(Map.Entry::getValue)
				.sum();
		System.out.println("sum of values: " + valSum);
	}
}
