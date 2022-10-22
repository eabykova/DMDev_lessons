package Lesson34;

public class AccountThread extends Thread {
	private final Account accountFrom;
	private final Account accountTo;

	public AccountThread(Account accountFrom, Account accountTo) {
		this.accountFrom = accountFrom;
		this.accountTo = accountTo;
	}

	@Override
	public void run() {
		synchronized (accountFrom) {
			synchronized (accountTo) {
				for (int i = 0; i < 20; i++){
					if (accountFrom.takeOff(10)) {
						accountTo.add(10);
					}
				}
			}
		}
	}
}
