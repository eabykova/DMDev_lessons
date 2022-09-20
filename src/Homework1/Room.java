package Homework1;

public class Room {
	private boolean passageRoom;

	public boolean isPassageRoom() {
		return passageRoom;
	}

	public void print() {
		if (passageRoom)
			System.out.println("The room is passage");
		else
			System.out.println("The room is not passage");
	}

	public Room(boolean passageRoom) {
		this.passageRoom = passageRoom;
	}
}
