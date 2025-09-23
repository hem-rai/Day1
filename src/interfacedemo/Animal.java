package interfacedemo;

interface Animal {

	public void animalSound();

	public void sleep();

}

class Pig implements Animal {

	public void animalSound() {

		System.out.println("The pig says weee weee.");
	}

	public void sleep() {

		System.out.println("ZZZzzzz..zz");
	}
}

class Dog implements Animal {

	public void animalSound() {

		System.out.println("The dog says vowwww voww.");
	}

	public void sleep() {

		System.out.println("Ghurrrr. ghurr...");
	}
}