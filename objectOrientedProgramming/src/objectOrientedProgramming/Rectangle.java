package objectOrientedProgramming;

public class Rectangle {
	private double length;
	private double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getArea() {
		return length * width;
	}

	public double perimeter() {
		return 2 * (length + width);
	}

	@Override
	public String toString() {
		return String.format("length - %.2f, width - %.2f, area - %.2f, permieter - %.2f", length, width, getArea(),
				perimeter());
	}

}
