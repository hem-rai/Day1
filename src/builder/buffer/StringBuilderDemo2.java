package builder.buffer;

//equals() compares address by default( i. e. if it is not overridden)
//StringBuilder/Buffer does not override equals()
public class StringBuilderDemo2 {

	public static void main(String[] args) {

		
		StringBuilder sb1 = new StringBuilder("hello");
		StringBuilder sb2 = new StringBuilder("hello");
		
		
		
		//Convert StringBuilder to String
		
		String str =sb1.toString();
		
		//
		
		System.out.println(sb1.equals(sb2)); //false ,equal() is not overridden in StringBuilder
		
		System.out.println(sb1.toString().equals(sb2.toString()));
		
		String str2 = "Manakamana";
		
		String reversed = new StringBuilder(str2).reverse().toString();
		System.out.println("Reversed String: " + reversed);
		
		//Write 3 different methods for reversing a string
		
		
		String str3 ="Longwood";
		
		for (int i = str3.length(); i>0; i--) {
			
			System.out.print(str3.charAt(i -1 ));
		}
		
		
		System.out.println(" ");

		System.out.println(" ");
		//using array
		
	
	String str4 = "Sunnyside";
		
		char [] charArray = str4.toCharArray();
		
		  for (int i = charArray.length - 1; i >= 0; i--) {
	            System.out.print(charArray[i]);
	        }
		
		
		
	}

}
