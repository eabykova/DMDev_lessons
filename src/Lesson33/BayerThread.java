package Lesson33;

import java.util.Queue;

public class BayerThread implements Runnable {
	private final Queue<Cashbox> cashboxes;

	public BayerThread(Queue<Cashbox> cashboxes) {
		this.cashboxes = cashboxes;
	}

	@Override
	public void run() {
		try {
			synchronized (cashboxes) {
				while (true) {
					if (!cashboxes.isEmpty()) {
						Cashbox cashbox = cashboxes.remove();
						System.out.println(Thread.currentThread().getName() + " serviced at the " + cashbox);
//						Thread.sleep(5L);
						cashboxes.wait(5L);
						System.out.println(Thread.currentThread().getName() + " free " + cashbox);
						cashboxes.add(cashbox);
						cashboxes.notifyAll();
						break;
					} else {
//						Thread.sleep(5L);
						cashboxes.wait();
						System.out.println(Thread.currentThread().getName() + " waiting for free cashbox");
					}
				}
			}

			} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
}

