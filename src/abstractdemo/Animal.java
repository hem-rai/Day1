package abstractdemo;

abstract class Animal {

	public abstract void animalSound();

	public void sleep() {

		System.out.println("ZZZz");
	}

}

class Pig extends Animal {
	public void animalSound() {
		System.out.println("The pig says : we we we weeeeee.");
	}

}


class Dog extends Animal {
	public void animalSound() {
		System.out.println("The dog says : vowwww..w wooo .");
	}

}