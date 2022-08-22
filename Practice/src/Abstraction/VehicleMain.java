package Abstraction;

abstract class Vehicle {
	int no_of_tyre;

	abstract void start();
}

class Car extends Vehicle {
	int no_of_tyre = 4;

	@Override
	void start() {
		System.out.println("for starting car ineed key");

	}

	void display() {
		System.out.println("4 tyre required");
	}

}

class Cycle extends Vehicle {
	int no_of_tyre = 2;

	@Override
	void start() {
		System.out.println("for start i need to used my legs");

	}

	void display() {
		System.out.println("2 tyre required");
	}

}

public class VehicleMain {

	public static void main(String[] args) {

		Car v= new Car();
		v.start();
		v.display();
		
		Cycle v1 = new Cycle();
		v1.start();
		v1.display();

	}

}
