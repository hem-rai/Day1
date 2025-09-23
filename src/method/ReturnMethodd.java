package method;

public class ReturnMethodd {

	public static void main(String[] args) {
	
		int collection = sum(20,30);
		System.out.println(collection);
		
		
		boolean result = isEven(20);
		
		
		System.out.println("The number is " + result);

	}
	
	
	
	
	


static int sum(int x, int y) { // user defined method. it can be used for several times.

	int result = x + y;

	
	
return result;

}


static boolean isEven(int x) {
	
	if (x%2 == 0) {
		return true;
	}else {
		return false;
	}
	
	
}

}
