package polymorphism.demo;

public class Main {

	public static void main(String[] args) {
	
		Animal myAni = new Animal(); // Animal reference 
		myAni.animalSound();
		
		
		
		Animal myPig = new Pig(); //Polymorphism
		
		myPig.animalSound();
		
	    Animal myDog = new Dog(); //Polymorphism
		
		myDog.animalSound();
		
		
		

	}

}
