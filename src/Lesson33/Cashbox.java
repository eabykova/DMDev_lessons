package Lesson33;

public class Cashbox extends Thread {

	private static int generator = 1;
	private int id;

	public Cashbox() {
		this.id = generator++;
	}

	@Override
	public String toString() {
		return "Cashbox " +
				"№" + id;
	}
}
