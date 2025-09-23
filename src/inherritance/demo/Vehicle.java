package inherritance.demo;

public class Vehicle {
	
	 protected int registration;
	public String brand = "Ford";

	public void honk() {

		System.out.println("Tututt");
	}

}

class Car extends Vehicle {
	
	public int registration = 42525;

	public String modelName = "Mustang";

	public int seat = 5;
	
	public void start() {

		System.out.println("Bhrum bhrummm");
	}

}
