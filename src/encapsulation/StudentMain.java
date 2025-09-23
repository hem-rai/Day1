package encapsulation;

public class StudentMain {

	public static void main(String[] args) {
	
		
		Student std1 = new Student();
		
		/*
		 * System.out.println(std1.name);
		 * 
		 * System.out.println(std1.password);
		 */
		
		System.out.println(std1.getName());
		System.out.println(std1.getPassword());
		
	std1.setPassword("testing");
		
		
	
	std1.setAge(30);
	
	System.out.println(std1.getAge());
	
	//storing modified age
	int age = std1.getAge();
		
	}

}
