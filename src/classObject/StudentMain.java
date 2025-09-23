package classObject;

public class StudentMain {

	public static void main(String[] args) {
	
		Student std1 = new Student();
		
		
		
		
		System.out.println(std1.name + " " + std1.grade + " " + std1.Id );
	    System.out.println(std1.play());
		
		//Using parameterized constructor
		
		Student std2 = new Student ("John", "Diploma", 3432);
		
		System.out.println(std2.name + " " + std2.grade + " " + std2.Id );
	    System.out.println(std2.play());
		
		
		

	}

}
