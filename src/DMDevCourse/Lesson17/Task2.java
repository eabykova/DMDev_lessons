package DMDevCourse.Lesson17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Task2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(12, 13, 13, 14, 15));
		System.out.println("The list contains " + countUnique(list) + " unique numbers");
	}
	private static int countUnique(List<Integer> nums) {
		return new HashSet<>(nums).size();
	}
}
