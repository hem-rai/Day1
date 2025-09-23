package polymorphism.demo;

public class Animal {

	public void animalSound() {

		System.out.println("The animal makes a sound.");

	}
}

class Pig extends Animal {
	@Override
	public void animalSound() {
		System.out.println("The pig says : we wee");

	}
	
}

class Dog extends Animal {
	@Override
	public void animalSound() {
		
		super.animalSound();
		System.out.println("The dog says : vow vow");

	}
	
	

}