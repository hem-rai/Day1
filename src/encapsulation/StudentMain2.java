package encapsulation;

public class StudentMain2 {

	public static void main(String[] args) {
	
		//this user wants to change id of the student
		
		
		Student s1= new Student();
		
		
		s1.setId(456);
		
		
		System.out.println(s1.getId());
		
		
		
		//again  this user wants to change id to 2000
		
		s1.setId(-200);
		
		System.out.println(s1.getId());
		

	}

}
