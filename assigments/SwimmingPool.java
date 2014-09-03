class SwimmingPool {

	private double depth, length, width;
	private boolean filled;

	public SwimmingPool () {
		depth = length = width = 5;
	}

	public SwimmingPool (double depth, double length, double width) {
		this.depth = depth;
		this.length = length;
		this.width = width;
	}

	public double getDepth() {
		return depth;
	}

	public double getLength () {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public boolean getFilled() {
		return filled;
	}

	public void setLength(double length){
		this.length = length;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public void setDepth(double depth){
		this.depth = depth;
	}

	public void setFilled(boolean filled){
		this.filled = filled;
	}

	public double amountOfWater() {
		if(!filled) {
			return 0;
		}

		return (length * width * depth) * 7.48;
	}

	public String toString() {
		return "Depth: " + depth + ", length: " + length + ", width: " +
			width + ", filled: " + filled;
	}

	// Depth: 5, length: 5, width: 5, filled: true

}
