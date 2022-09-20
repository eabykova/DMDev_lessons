package Lesson19;

import java.util.ArrayList;

public class Task2 {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<>();
		num.add(12);
		num.add(10);

		try {
			for(int i = 0; i < 10; i++) {
				System.out.println(num.get(i));
			}
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Out of bounds!");
			e.printStackTrace();
		}
	}
}
