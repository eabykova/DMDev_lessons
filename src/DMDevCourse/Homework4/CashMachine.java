package DMDevCourse.Homework4;

public class CashMachine {
	private int bill20;
	private int bill50;
	private int bill100;

	public CashMachine(int bill20, int bill50, int bill100) {
		this.bill20 = bill20;
		this.bill50 = bill50;
		this.bill100 = bill100;
	}

	public int total() {
		return bill20 * 20 + bill50 * 50 + bill100 * 100;
	}

	public void printInfo() {
		System.out.println("$20 bill: " + bill20 + "; $50 bill: " + bill50 + "; $100 bill: " + bill100);
		System.out.println("$20 bill sum: " + bill20 * 20 + "; $50 bill sum: " + bill50 * 50 + "; $100 bill sum: " + bill100 * 100);
		System.out.println("Total sum in ATM: " + total());
	}

	public void putMoney(int bill20, int bill50, int bill100) {
		this.bill20 += bill20;
		this.bill50 += bill50;
		this.bill100 += bill100;
	}

	public boolean withdrawMoney(int sum) {
		if (sum % 100 % 50 % 20 == 0) {
			int num100 = sum / 100;
			int num50 = sum % 100 / 50;
			int num20 = sum % 100 % 50 / 20;
			this.bill20 -= num20;
			this.bill50 -= num50;
			this.bill100 -= num100;
			System.out.println("$20 withdrawn: " + num20 + "; $50 withdrawn: " + num50 + "; $100 withdrawn: " + num100);
			return true;
		}
		else {
			System.out.println("Take request for another sum");
			return false;
		}
	}
}
