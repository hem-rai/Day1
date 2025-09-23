package method;

public class MethodDemo2 {

	public static void main(String[] args) {
	
sum(20,40);
multi(3,7);
multi(3,7,2);

printHello();
		
		

	}

	static void sum(int x, int y) { // user defined method. it can be used for several times.

		int result = x + y;
		System.out.println(result);
		
		
		multi(6,8);

	}
	
	static void multi(int x, int y) { // user defined method. it can be used for several times.

		int result = x * y;
		System.out.println(result);

	}
	
	
	static void multi(int x, int y, int z) { //method overloading 

		int result = x * y * z;
		System.out.println(result);

	}
	
	
	static void printHello() { //method overloading 


		System.out.println("Hello");

	}
	
	
}
