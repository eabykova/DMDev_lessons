package Lesson20;

import java.util.Comparator;

public class LambdaExample {
	public static void main(String[] args) {
		//Example of Lambda Expression since Java 1.8
		Comparator<Integer> comparator = Integer::compare;
		System.out.println(comparator.compare(34, 89));

		System.out.println();
		//Example of simple method before Java 1.8
		Comparator<Integer> comparator1 = new IntegerComparator();//with @FunctionalInterface only
		System.out.println(comparator1.compare(34, 89));
	}

	private static class IntegerComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			return Integer.compare(o1, o2);
		}
	}
}
