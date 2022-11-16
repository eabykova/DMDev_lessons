package DMDevCourse.Lesson30;

import java.util.List;

public class ListThread extends Thread {
	private final List<Integer> list;

	public ListThread(List<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
//			synchronized (list) {//есть возможность использования synchronized блока внутри итератора, но при этом
			//остальные методы коллекции остаются доступными для всех потоков программы, что может быть небезопасным
				list.add(i);
//			}
		}
	}
}
