package DMDevCourse.Homework1;

public class PrintInfo {
	public static void main(String[] args) {
		Room[] rooms1 = {new Room(true), new Room(false)};
		Room[] rooms2 = {new Room(false), new Room(false), new Room(true)};
		Room[] rooms3 = {new Room(false)};
		Room[] rooms4 = {new Room(true), new Room(false), new Room(false), new Room(true)};
		Room[] rooms5 = {new Room(false)};
		Flat[] flatArr1 = {new Flat(1, rooms1), new Flat(2, rooms2)};
		Flat[] flatArr2 = {new Flat(1, rooms3), new Flat(2, rooms4), new Flat(3, rooms5)};
		Floor[] fArr = {new Floor(1, flatArr1) , new Floor(2, flatArr2)};
		House house = new House(1, fArr);

		System.out.println("About the house:");
		house.print();
		System.out.println("About flats at the first floor:");
		for (Flat flat : flatArr1)
			flat.print();
		System.out.println("About rooms:");
		for (Room room : rooms1)
			room.print();
		for (Room room : rooms2)
			room.print();
		System.out.println("About flats at the second floor:");
		for (Flat flat : flatArr2)
			flat.print();
		System.out.println("About rooms:");
		for (Room room : rooms3)
			room.print();
		for (Room room : rooms4)
			room.print();
		for (Room room : rooms5)
			room.print();
	}
	public static void printAllInformation(House house) {
		house.print();//how can I do this? Search!
	}
}
