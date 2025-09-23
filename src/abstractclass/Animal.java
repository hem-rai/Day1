package abstractclass;

public abstract class Animal {

	// non abstract method
	void run() {

		System.out.println("Running 10 miles/hr");
	}

	// abstract method (definition or implementation is unknown)
	abstract void makeSound(); // abstract methods must be implemented by child classes

}

class Dog extends Animal {

	@Override
	void makeSound() {
		System.out.println(" Dog is barking");
	}
}