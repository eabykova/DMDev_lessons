package DMDevCourse.Homework4;

public class TestCashMachine {
	public static void main(String[] args) {
		CashMachine cashMachine = new CashMachine(200, 100, 30);
		System.out.println("Start work: ");
		cashMachine.printInfo();
		cashMachine.putMoney(2, 16, 4);
		System.out.println("After put some cash: ");
		cashMachine.printInfo();
		System.out.println();
		cashMachine.withdrawMoney(300);
		System.out.println("After withdraw some money: ");
		cashMachine.printInfo();
	}

}
