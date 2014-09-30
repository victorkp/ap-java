class Vehicle { // Parent class
	public double topSpeed;
	public String owner;
}

class Car extends Vehicle { // Child class
	public String licensePlate;
	public int numWheels;
}

class Boat extends Vehicle { // Child class
	public boolean hasSails;
	public double length;
}

Car c = new Car();
c.topSpeed = 100;


class Collections {
	public void remove(Object o){ }
	public int indexOf(Object o){ }
}

class ArrayList extends Collections {
	Object[] array;

	// Constructors and stuff

	public void remove(Object o) {
		// Add the code to remove from 'array'
	}
}

class LinkedList extends Collections {
	public void remove(Object o) {
		// Implementation here
	}
}

Object o = ....;
Collection collection = new ArrayList();
collection.remove(o);

Collection collection2 = new LinkedList();
collection2.remove(o);

