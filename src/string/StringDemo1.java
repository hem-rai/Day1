//package string;
//
////String is a class in Java. All strings created are object of this class
//
////When we do any operation with string, final result will be String data type.
//public class StringDemo1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		// creating string method 1
//
//		String str1 = "Prakash";
//
//		// creating string method 2
//
//		String str2 = new String("Prakash2");
//
//		String str3 = 2 + 3 + "Prakash";
//
//		System.out.println(str3);
//
//		System.out.println(2 + 3 + "prakahs" + 5); // 5prakahs5
//
//		System.out.println(2 + 3 + "prakahs" + 2 + 3); // 5prakash23
//
//		System.out.println("2" + 3 + "prakahs" + 2 + 3); // 23prakash23
//
//		// length of a string
//
//		String str4 = "Massachusetts";
//
//		System.out.println(str4.length());
//
//		// printing first letter of a string
//		System.out.println(str4.charAt(0));
//
//		// printing last letter of a string
//
//		System.out.println(str4.charAt(str4.length() - 1));
//
//		// substring
//		System.out.println(str4.substring(1)); // assachusetts
//		System.out.println(str4.substring(2));
//
//		//
//		System.out.println(str4.substring(0, 4)); // Mass
//		System.out.println(str4.substring(0, 12)); // Massachusett
//
//		System.out.println("JavaSpringHibernate".substring(10, 19));
//
//		System.out.println("JavaSpringHibernate".substring(10, "JavaSpringHibernate".length()));
//
//		String s1 = "Prakash";
//		s1 = s1 + "Nepal";
//		s1 = s1 + 2025;
//
//		
//		// Strings are immutable
//		//garbage collection
//		
//		System.out.println("s1 is " +s1);
//		
//		
//		String s2 ="Spring java hibernate";
//		
//		String[] arrOfStrings = s2.split(" ");
//		
//		
//		for(String str : arrOfStrings) {
//			System.out.println(str);
//		}
//		
//		
//		
//		String s3 ="Spring@java@hibernate";
//		
//		String[] arrOfStrings2 = s3.split(" @");
//		
//		
//		for(String str : arrOfStrings2) {
//			System.out.println(str);
//		}
//		
//		
//		
//		//search
//		
//		System.out.println(s2.contains("java"));
//		System.out.println(s2.contains("deepa"));
//		
//		boolean found = s2.contains("Spring");
//		
//		System.out.println(found);
//		
//		//compare
//		
//	     String s5 = "app";
//	        String s6 = "dog";
//
//	        System.out.println("This is compare result: " + s6.compareTo(s5));
//		
//		//InternPool/StringPool are
//		//Object with duplicate values not allowed
//		
//		//Heap memory
//		
//		
//		String s10 = "Spring";
//		String s20 = "Spring";
//		
//		//Heap memory 
//		//When we create object with new key word new object will go to heap memory
//		String s30 = new String("Spring");
//		String s40 = new String("Spring");
//		
//		
//		//equals method
//		//It compares the content of string objects
//		System.out.println(s10.equals(s20)); //true
//		System.out.println(s10.equals(s30)); //true
//		
//		//In general equals() originally belongs to Object class which compare addresses (not content)
//		//Object class is parent of every class
//		//String class overrides inherited equals() so that it could compare 2 strings by content
//		
//		
//	}
//
//}
