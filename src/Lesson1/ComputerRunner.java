package Lesson1;

public class ComputerRunner {
	public static void main(String[] args) {
		Computer computer = new Computer();
		try {
			computer.load();
		} catch (InterruptedException e) {
			System.out.println("Error in loading");
		}
		System.out.println("RAM: " + computer.getRam());
		System.out.println("SSD: " + computer.getSsd());
	}
}
