/**
 * A sample Truck class that demonstrates
 * constructrs, private vs public, 
 */
public class Truck {

	// These are private so that
	// they cannot be accessed directly
	private String color;
	private String brand;

	// Default Constructor: takes no arguments
	public Truck() {
		color = "blue";
		brand = "N/A";
	}

	// Other constructors
	public Truck(String brand) {
		this.brand = brand;
	}

	public Truck(String brand, String color) {
		this.brand = brand;
		this.color = color;
	}


	// Setters (AP refers to them as "mutators")
	public void setColor(String color) {
		this.color = color;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}


	// Getters (AP refers to these as "accessors")
	public String getColor() {
		return color;
	}

	public String getBrand() {
		return brand;
	}


}
