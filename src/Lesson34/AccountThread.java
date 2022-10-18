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

			}
		}
	}
}
