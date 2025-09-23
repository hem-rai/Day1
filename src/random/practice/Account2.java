package random.practice;

public class Account2 {
	
	static void myMethod15() {
		System.out.println("Hello");
	}
	
	public int id = 345;
	public static String name = "Mandip";
	private int balance = 3000; //this can only be accessible inside this class
	

	public static void main(String[] args) {
		
		
		
		myMethod15();
		
		System.out.println(name); // this is static attribute so we don't have to create object
		
		Account2 myObj11 = new Account2();
		
		System.out.println(myObj11.id);
		
		System.out.println(myObj11.balance);
		
		
	}
	
	
}
