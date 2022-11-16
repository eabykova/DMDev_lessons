package DMDevCourse.Homework1;

public class Flat {
	private int number;
	private Room[] rooms;

	public Flat(int number, Room[] rooms) {
		this.number = number;
		this.rooms = rooms;
	}

	public void print() {
		System.out.println("The number of flat is: " + number + ", there are " + rooms.length + " rooms here");
	}

	public int getNumber() {
		return number;
	}

	public Room[] getRooms() {
		return rooms;
	}
}
