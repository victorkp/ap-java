public class MainClass {

	public static void main(String[] args) {
		Truck victorsTruck = new Truck();

		System.out.println("Default values: ");
		printTruck(victorsTruck);

		victorsTruck.setColor("red");
		victorsTruck.setBrand("GMC");

		System.out.println("Update values: ");
		printTruck(victorsTruck);
	}

	private static void printTruck(Truck t) {
		System.out.println("Color: " + t.getColor());
		System.out.println("Brand: " + t.getBrand());
	}

}
