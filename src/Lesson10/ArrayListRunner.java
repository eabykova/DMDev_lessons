package Lesson10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListRunner {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<Integer>(5);
		integers.add(1);
		integers.add(2);
		integers.add(4);
		integers.add(5);
		integers.add(6);
		integers.add(7);
		System.out.println(integers.get(3));
		System.out.println(integers.contains(30));

		List<Integer> integers1 = new LinkedList<>();
		integers1.add(1);
		integers1.add(2);
		integers1.add(4);
		integers1.add(5);
		integers1.add(6);
		integers1.add(7);
		System.out.println(integers1.get(3));
		System.out.println(integers1.contains(30));
	}
}
