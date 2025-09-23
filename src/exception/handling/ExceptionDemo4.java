package exception.handling;

public class ExceptionDemo4 {


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
			
			
			
			
			
			catch (ArithmeticException ex) {
				System.out.println("Arithmetic exception handled here.");
				
				//System.out.println(ex);
			} //if the first catch catches the exception, second catch will not work
			
			catch (Exception ex) {
				System.out.println("Exception handled here.");
				
				//System.out.println(ex);
			}
			
			
			System.out.println("End of program.");

		}

	}