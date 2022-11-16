package DMDevCourse.Lesson29;

public class Counter {
	private int count;
	private static String description;

	public static void init() {
		synchronized (Counter.class) {//происходит захват монитора на уровне метода
			//данный блок работает по принципу singleton
			if (description == null) {
				description = "Test description";
			}
		}
	}

	public void increment() {
		synchronized (this) {//использоавние внутри метода в блоке
			count++;//является более гибким, т.к. часть кода, не входящая в болк,
					//доступна для выполнения потоками без ограничений
					//Минус в том, что блок не задокументирован в методе, для его
					//идентификации необходимо вникать в логику метода
		}
	}
	public synchronized void decrement() {//synchronized можно использовать на уровне метода
		count--;//в этом случае его синхронизированность задокументирована в сигнатуре метода
	}
	public int getCount() {
		return count;
	}
}
