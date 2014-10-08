public class Circle extends Shape {

	private double radius;

	public Circle(double rad) {
		super();
		radius = rad;
	}

	@Override
	public double getArea() {
		return 3.1415 * radius * radius;
	}

	@Override
	public String toString() {
		return "Radius: " + radius + ", " + super.toString();
	}

	@Override
	public boolean equals(Object o) {
		if(! o instanceof Circle) {
			return false;
		}

		return super.equals(o);
	}

}
