package Lesson31;

public class VolatileDemo {
	private static volatile boolean flag = false;//применеие volatile обязывает процесс пользоваться данными
	// только из оперативной памяти, игнорируя кэши процессоров

	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(() -> {
			while (!flag) {
				System.out.println("still false");
			}
		});
		thread1.start();
		Thread.sleep(5L);
		Thread thread2 = new Thread(() -> {
			flag = true;
			System.out.println("flag is set");
		});
		thread2.start();

	}
}
