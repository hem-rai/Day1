package exam;

public class Calculator {

	public int add(int a, int b) {
		
		return a + b;
	}
	
	
	public double add(double a, double b) {
		
		return a + b;
	
	
}
	
	
	public static void main(String[] args) {
		Calculator myObj = new Calculator();
		
		System.out.println(myObj.add(37, 6));
		
		System.out.println(myObj.add(37.4, 6.4));
	}
	
	
	
}

