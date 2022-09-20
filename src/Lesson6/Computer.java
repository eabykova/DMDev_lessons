package Lesson6;

public abstract class Computer implements Printable {
	private Ram ram;
	private Ssd ssd;

	public Computer(Ram ram, Ssd ssd) {
		this.ram = ram;
		this.ssd = ssd;
	}

	public Ram getRam() {
		return ram;
	}

	public Ssd getSsd() {
		return ssd;
	}

	public abstract void load();

	@Override
	public void print() {
		System.out.println("SSD: " + ssd.getVal() + " RAM: " + ram.getVal());
	}

//	public void load() {
//		System.out.println("Loading...");
//	}
}
