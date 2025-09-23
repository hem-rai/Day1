package classObject;

public class Doggy {

	String name = "Jacky"; // null
	int age = 10; // 0
	String color = "black"; // null

	// Behaviour
	void bark() {

		System.out.println("Dog is barking.");
	}

	void jump() {

		System.out.println("Dog is jumping.");
	}

	// Default constructor (provided when no constructor is not already)
	Doggy() {

	}

	// Parameterize constructor

	Doggy(String name, int age, String color) {

		this.name = name;
		this.age = age;
		this.color = color;

	}

}
