public class Rectangle extends Shape {

	private double width, height;

	public Rectangle(double wd, double hgt) {
		super();
		width = wd;
		height = hgt;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public String toString() {
		return "Width: " + width + ", height: " + height +
			", " + super.toString();
	}

	@Override
	public boolean equals(Object o) {
		if(! o instanceof Rectangle) {
			return false;
		}

		Rectangle r = (Rectangle) o;

		return (this.width == r.getWidth() &&
			this.height == r.getHeight() &&
			super.equals(o) );
	}
	
}


