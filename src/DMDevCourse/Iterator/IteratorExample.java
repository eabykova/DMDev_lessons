package DMDevCourse.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
	public static void main(String[] args) {
		List<Integer> integers = new ArrayList<>(6);
		integers.add(1);
		integers.add(3);
		integers.add(2);
		integers.add(7);
		integers.add(0);

//		for (Integer integer : integers) {
//			System.out.println(integer);
//		}
		for (Iterator<Integer> iterator = integers.iterator(); iterator.hasNext(); ) {
			Integer next = iterator.next();
			if (next == 3 || next == 4) {
				iterator.remove();
			}

		}
		Iterator<Integer> iter = integers.iterator();
		while (iter.hasNext()) {
			Integer next = iter.next();
			System.out.println(next);
		}
	}
}
