public class ShapeMain {

	public static void main(String[] args) {
		Shape[] shapes = new Shape[4];
		shapes[0] = new Rectangle(3, 4);
		shapes[1] = new Circle(4);
		shapes[2] = new Circle(5);
		shapes[3] = new Rectangle(5, 2);

		Shape largest = shapes[0];
		for(int i = 1; i < shapes.length; i++) {
			if(shapes[i].getArea() > largest.getArea()){
				largest = shapes[i];
			}
		}

		System.out.println(largest);
	}

}
