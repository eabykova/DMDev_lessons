package Homework1;

public class House {
	private int number;
	private Floor floors[];

	public House (int number, Floor floors[]){
		this.number = number;
		this.floors = floors;
	}

	public void print() {
		System.out.println("The number of hous is: " + number + ", there are " + floors.length + " rooms here");
	}

	public int getNumber() {
		return number;
	}

	public Floor[] getFloors() {
		return floors;
	}
}
