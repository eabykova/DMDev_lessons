package Lesson28;

public class ThreadDemo {
	public static void main(String[] args) {

		SimpleThread simpleThread = new SimpleThread();
		System.out.println(simpleThread.getName() + ": " + simpleThread.getState());
		Thread runnableThread = new Thread(new SimpleRunnable(), "My name");
		Thread lambdaThread = new Thread(() -> System.out.println("Hello from lambda: " + Thread.currentThread().getName()));
		simpleThread.start();
		System.out.println(simpleThread.getName() + ": " + simpleThread.getState());
		runnableThread.start();
		lambdaThread.start();
		try {
			simpleThread.join();
			runnableThread.join();
			lambdaThread.join();
		} catch (InterruptedException e) {
			System.err.println("InterruptException cough");
			e.printStackTrace();
		}
		System.out.println(simpleThread.getName() + ": " + simpleThread.getState());
		System.out.println("Name of current thread: " + Thread.currentThread().getName());
	}
}
