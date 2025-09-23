package p2;

import p1.A;

public class D extends A{

	public static void main(String[] args) {
	
		
		D d = new D();

	
		
		//System.out.println(d.p);
		
		//System.out.println(d.q);
		System.out.println(d.r); // this is protected and this class is derived as a child class from class A
		
		System.out.println(d.s);
		
		
		
		
		
	}

}
