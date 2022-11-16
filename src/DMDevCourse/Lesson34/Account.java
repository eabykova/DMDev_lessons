package DMDevCourse.Lesson34;

public class Account {
	private static int generator = 1;
	private int id;
	private int money;

	public Account(int money) {
		this.money = money;
		this.id = generator++;
	}

	@Override
	public String toString() {
		return "Account " +
				"№" + id +
				", has " + money +
				" $";
	}

	public void add(int money) {
		this.money += money;
	}

	public boolean takeOff(int money) {
		if (this.money >= money) {
			this.money -= money;
			return true;
		}
		return false;
	}

	public int getId() {
		return id;
	}

	public int getMoney() {
		return money;
	}
}
