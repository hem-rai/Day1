package random.practice;

public class Demo {

	//Static, package-private(default)
	static void myMethod3() {

		System.out.println("Hello this is myMethod3");

	}
	// Non-static, package-private method can be called inside the same package
	
	 void myMethod4() {

		System.out.println("Hello this is myMethod4");

	}
	 
	 //Non-static method can be called from outside the package
	 
	public void myMethod5() {

			System.out.println("Hello this is myMethod5");

		}

}
