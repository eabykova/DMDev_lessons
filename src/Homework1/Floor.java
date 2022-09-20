package Homework1;

public class Floor {
	private int number;
	private Flat[] flats;

	public Floor(int number, Flat[] flats) {
		this.number = number;
		this.flats = flats;
	}

	public void print() {
		System.out.println("The number of floor is: " + number + ", there are " + flats.length + " rooms here");
	}

	public int getNumber() {
		return number;
	}

	public Flat[] getFlats() {
		return flats;
	}
}
