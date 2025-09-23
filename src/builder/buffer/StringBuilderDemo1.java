package builder.buffer;

public class StringBuilderDemo1 {

	public static void main(String[] args) {

		
		StringBuilder sb1 = new StringBuilder("Hello");
		
		
		
		System.out.println(sb1.append("World"));
		
		System.out.println(sb1);
		
		
		//StringBuilder sb2 = "Hello";  is not allowed
		
		sb1.delete(0,  3);
		System.out.println(sb1);
		
		sb1.insert(0, "Nepal");
		System.out.println(sb1);
		sb1.delete(5, 7);
		
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(" -");
	
		System.out.println(" -");
		System.out.println(" -");
		
		
		//String sb2 = "Hello";
		
		// sb2.reverse(); reverse method is not allowed for string class.
		
		//Method chaining 
		
		
		StringBuilder sb2 = new StringBuilder("Hello");
		
		
		System.out.println(sb2.append("World").delete(0, 3).insert(0,  "nepal").delete(5,  7).reverse());
		

		
	}

}
