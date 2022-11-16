package DMDevCourse.Homework3;

public class Rectangle {
	private Point leftUpperPoint;
	private Point rightLowerPoint;

	public Rectangle(Point leftUpperPoint, Point rightLowerPoint) {
		this.leftUpperPoint = leftUpperPoint;
		this.rightLowerPoint = rightLowerPoint;
	}

	public double getDiagonal() {
		return leftUpperPoint.distance(rightLowerPoint);
	}

	public int getArea() {
		return (rightLowerPoint.getX() - leftUpperPoint.getX()) * (rightLowerPoint.getY() - leftUpperPoint.getY());
	}

	public Point getLeftUpperPoint() {
		return leftUpperPoint;
	}

	public void setLeftUpperPoint(Point leftUpperPoint) {
		this.leftUpperPoint = leftUpperPoint;
	}

	public Point getRightLowerPoint() {
		return rightLowerPoint;
	}

	public void setRightLowerPoint(Point rightLowerPoint) {
		this.rightLowerPoint = rightLowerPoint;
	}
}
