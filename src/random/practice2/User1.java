package random.practice2;

import random.practice.Demo;
import random.practice.Main;
import random.practice.Account2;

public class User1 {
	

	public static void main(String[] args) {
	//Can call public static method from Main
	Main.myMethod2();

	
	//Create Demo object to call public non-static method
	Demo myObj = new Demo();
	
	myObj.myMethod5();
	
	
	System.out.println(Account2.name); // public static attribute from Account2 and different package
	
	Account2 myObj12 = new Account2();
	
	System.out.println(myObj12.id);
	
	// System.out.println(myObj12.balance); //we cann't access balance from outside the package because it is private
	
	

	}
	
	
	
	

}
