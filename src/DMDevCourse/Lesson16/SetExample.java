package DMDevCourse.Lesson16;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();	//не сохраняет порядок добавдения элеменов в список.
		new LinkedHashSet<>();	//для сохранения этого порядка можно использовать LinkedHashSet
		new TreeSet<>();		//для упорядочевания элементов в алфавитном порядке можно использовать TreeSet
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		set.add("ddd");
		set.add("aaa");//не добавит повторяющийся элемент

		System.out.println("set: " + set);
	}
}
