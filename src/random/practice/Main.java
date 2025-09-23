package random.practice;
import random.practice2.StudentDemo2;

public class Main {

	// for inside the package
	static void myMethod() {

		System.out.println("This is myMethod");
	}

	// for outside the package we have to make it public
	public static void myMethod2() {

		System.out.println("This is myMethod2");
	}

	public static void main(String[] args) {

		myMethod();

		myMethod2();
		
		//static method from Demo class
		
		Demo.myMethod3();

		//non static method from Demo class
		
		Demo myObj = new Demo();
		myObj.myMethod4();
		
		
		StudentDemo myObj2 = new StudentDemo();
		
		System.out.println(myObj2.id);
		
		System.out.println(myObj2.name);
		System.out.println(myObj2.age);
		
		
		
		StudentDemo2 myObj3 = new StudentDemo2();
		
		System.out.println(myObj3.ids);
		
		System.out.println(myObj3.names);
		System.out.println(myObj3.ages);
		
		
		
		//calling constructor
		Account myObj4 = new Account();
		
		System.out.println(myObj4.id);
		System.out.println(myObj4.name);
		System.out.println(myObj4.balance);
		
		
		myObj4.myMethod7(4, "Shishir", 50000);
		

			System.out.println(myObj4.id);
			System.out.println(myObj4.name);
			System.out.println(myObj4.balance);
			
		
	Account myObj5 = new Account(111,"Reshma", 3000);
		
		System.out.println(myObj5.id);
		System.out.println(myObj5.name);
		System.out.println(myObj5.balance);
		
		
	Account myObj6 = new Account(222, 15000);
		
		System.out.println(myObj6.id); //222
		System.out.println(myObj6.name); //null
		System.out.println(myObj6.balance); //15000
		
		myObj4.myMethod7(4, "Shishir", 50000);
		
	//Account myObj4 = new Account();
//		
		System.out.println(myObj4.id);
		System.out.println(myObj4.name);
		System.out.println(myObj4.balance);
		
		

		Account2 myObj11 = new Account2();
		
		System.out.println(myObj11.id);
		
		//System.out.println(myObj11.balance); //We cann't access this balance from outside the class because it is private
		
		
		
		
	}

}
