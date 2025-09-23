package exception.handling;

public class ExceptionDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		
		int no1 =100;
		int no2 =0;
	
		
		System.out.println(no1/2); //50
		
	
		
		System.out.println(no1/no2);  //dividing by 0 is not allowed in java//Arithmetic class
		
		//When exception comes, program is abnormally terminated, and it does not continue further
		System.out.println("This might create error."); //this line is never executed
		
		}
		
		catch (NullPointerException ex) {
			System.out.println("NullPointer exception handled here."); //this will not catch arithmetic exception
			
			//System.out.println(ex);
		} 
		
		
		
		
		finally {
			System.out.println("It will always excute code. No matter exception handeled or not. ");
		}
	
		
		
		System.out.println("End of program.");

	}

}