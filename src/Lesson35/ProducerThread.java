package Lesson35;

import java.util.Queue;

public class ProducerThread implements Runnable {

	private final Queue<Integer> list;

	public ProducerThread(Queue<Integer> list) {
		this.list = list;
	}

	@Override
	public void run() {
		synchronized (list) {
			while (true) {
				if (list.size() < 10) {
					int random = RandomUtil.getRandom();
					list.add(random);
//					list.notifyAll();
					System.out.println("producer adds value: " + random + ". Size = " + list.size());
				} else {
					System.out.println("producer does nothing");
				}
				try {
					int randomWaitVal = 20;
					System.out.println("producer waits " + randomWaitVal + " ms");
					list.wait(randomWaitVal);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
