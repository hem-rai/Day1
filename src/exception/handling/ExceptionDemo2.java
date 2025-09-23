package exception.handling;

public class ExceptionDemo2 {

	public static void main(String[] args) {
	
		
		
		int no1 =100;
		int no2 =0;
	
		
		System.out.println(no1/2); //50
		
		try {
		
		
		System.out.println(no1/no2);  //dividing by 0 is not allowed in java//Arithmetic class
		
		//When exception comes, program is abnormally terminated, and it does not continue further
		}
		catch(Exception ex) {
			System.out.println("Exception handled here.");
		}
		
		
		System.out.println("End of program.");

	}

}
