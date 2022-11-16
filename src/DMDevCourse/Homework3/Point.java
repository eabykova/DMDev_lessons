package DMDevCourse.Homework3;

public class Point {
	private int x;
	private int y;

	public double distance(Point point) {
		double xPow = Math.pow(x - point.x, 2.0);
		double yPow = Math.pow(y - point.y, 2.0);
		return Math.sqrt(xPow + yPow);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
