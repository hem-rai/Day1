package p1;

//Access modifiers>>private>default.protected

public class A {

	
	private int p=10; //can be accessed only within the class
	int q=20; //default //can be accessed within the same package.
	protected int r=30; //you can access it from outside the package but it should child class objec
	public int s=40; //anyone can access 
	
	
	
	public static void main(String[] args) {
		
		A a= new A();
		
		System.out.println(a.p);
		
		System.out.println(a.q);
		System.out.println(a.r);
		
		System.out.println(a.s);
		
	}

}
