package DMDevCourse.Lesson17;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		for (int i = 0; i < 20; i++)
			nums.add(i);
		System.out.println("nums: " + nums);
		System.out.println("oddNums: " + removeEven(nums));
	}

	private static List<Integer> removeEven(List<Integer> nums) {
		List<Integer> oddNums = new ArrayList<>();
		for (Integer num : nums) {
			if (num % 2 != 0) {
				oddNums.add(num);
			}
		}
		return oddNums;
	}
}
