package Lesson30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Integer> integers = Collections.synchronizedList(new ArrayList<>());//применяя "обертку" synchronized
		// для листа решается проблема доступа к коллекции (ко всем ее методам) только одним потоком в единицу времени
		// но сам по себе захват монитора коллекции явдяется трудоемким для процессора
 		ListThread listThread1 = new ListThread(integers);
		ListThread listThread2 = new ListThread(integers);
		ListThread listThread3 = new ListThread(integers);
		ListThread listThread4 = new ListThread(integers);
		ListThread listThread5 = new ListThread(integers);
		ListThread listThread6 = new ListThread(integers);

		listThread1.start();
		listThread2.start();
		listThread3.start();
		listThread4.start();
		listThread5.start();
		listThread6.start();

		try {
			listThread1.join();
			listThread2.join();
			listThread3.join();
			listThread4.join();
			listThread5.join();
			listThread6.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(integers);
	}
}
