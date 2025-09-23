package abstractclass;

public class TestAnimal {

	public static void main(String[] args) {

		Animal animal; // creating reference of abstract class
		// Animal a1 = new Animal(); //error as Animal is an abstract class
		Dog d1 = new Dog();

		animal = new Dog();

		animal.makeSound();
		animal.run();
		animal.makeSound();

	}

}
