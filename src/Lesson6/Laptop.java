package Lesson6;

public final class Laptop extends Computer {	//при использовании final в объявлении класса этот касс
												// становится последним в иерархии от него наследоваться нельзя
												// то же самое касается мтодов класса, такие методы нельзя
												// переопределять у наследников этого класса
	private int weight;

	public Laptop(Ram ram, Ssd ssd, int weight) {
		super(ram, ssd);
		this.weight = weight;
	}

	public void open() {
		System.out.println("The lid is open");
	}

	public void load() {
		open();
		System.out.println("Laptop loading....");
	}

	public void print() {
		open();
		super.print();
	}
}
