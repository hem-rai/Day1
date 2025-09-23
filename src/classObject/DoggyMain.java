package classObject;

public class DoggyMain {

	public static void main(String[] args) {
	
		
		
		Doggy doggy1 = new Doggy();
		Doggy doggy2 = new Doggy();
		
		
		
		System.out.println(doggy1.name + " " + doggy1.color +" " + doggy1.age );
		System.out.println(doggy2.name + " " + doggy2.color +" " + doggy2.age );
	

		
		
		
		
		Doggy doggy3=new Doggy("Sweety", 7, "Black");
		Doggy doggy4=new Doggy("Manky", 11, "Brown");
		
		
		System.out.println(doggy3.name + " " + doggy3.color +" " + doggy3.age );
		System.out.println(doggy4.name + " " + doggy4.color +" " + doggy4.age );
	}

}
