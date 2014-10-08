public class Shape {

	private double xCoordinate, yCoordinate;

	// Default constructor
	public Shape() {
		xCoordinate = 0;
		yCoordinate = 0;
	}

	public Shape(double x, double y) {
       		xCoordinate = x;
		yCoordinate = y;
	}

	public double getArea() {
		return 0;
	}

	public double getX() {
		return xCoordinate;
	}

	public double getY() {
		return yCoordinate;
	}

	@Override
	public String toString() {
		return "Area: " + this.getArea();
	}

	@Override
	public boolean equals(Object o) {
		if(! o instanceof Shape) {
			return false;
		}

		Shape c = (Shape) o;

		return (this.getArea() == c.getArea() &&
			this.xCoordinate == c.getX() &&
			this.yCoordinate == c.getY());
	}
}
