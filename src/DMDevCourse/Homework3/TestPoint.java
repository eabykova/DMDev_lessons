package DMDevCourse.Homework3;

public class TestPoint {
	public static void main(String[] args) {
		Point point = new Point(0, 12);
		Point point1 = new Point(3, 16);

		System.out.println("The distance between two points: " + point.distance(point1));
		System.out.println("The distance between two points: " + point1.distance(point));
		System.out.println("The distance between point and the same point: " + point.distance(point));

		Rectangle rectangle = new Rectangle(point, point1);
		System.out.println("The area of rectangle: " + rectangle.getArea());
		System.out.println("The diagonal of rectangle: " + rectangle.getDiagonal());


	}
}
