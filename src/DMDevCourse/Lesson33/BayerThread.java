package DMDevCourse.Lesson33;

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
						cashboxes.wait(5L);//поток ждет определенное время
						System.out.println(Thread.currentThread().getName() + " free " + cashbox);
						cashboxes.add(cashbox);
						cashboxes.notifyAll();//используется для уведомления остальных потоков о том,
												//что работа может быть продолжена
						break;
					} else {
//						Thread.sleep(5L);
						cashboxes.wait();//поток ждет, пока не освободится монитор объекта
						System.out.println(Thread.currentThread().getName() + " waiting for free cashbox");
					}
				}
			}

			} catch (InterruptedException e) {
				e.printStackTrace();
		}
	}
}

