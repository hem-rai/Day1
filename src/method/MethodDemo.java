package method;

// system defined method (inbuilt method)
public class MethodDemo {

	public static void main(String[] args) { // inbuilt method

		int a = 10;
		int b = 20;
		int result1 = a + b;

		System.out.println(result1);

		int d = 5;
		int e = 30;
		int result2 = d + e;
		System.out.println(result2);

		sum(10, 20); // calling method

	}

	static void sum(int x, int y) { // user defined method. it can be used for several times.

		int result = x + y;
		System.out.println(result);

	}
	
	
}
