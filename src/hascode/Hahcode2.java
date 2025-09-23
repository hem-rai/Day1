package hascode;

public class Hahcode2 {

	public static void main(String[] args) {
	
		
		//different dog but having same characteristic 
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		
		System.out.println(dog1.equals(dog2)); //false if equals not overridden
		
		System.out.println(dog1.hashCode()); //different  result if has method is not applied 
		System.out.println(dog2.hashCode()); 
		
	}
	

}
