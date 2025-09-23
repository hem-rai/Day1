package exam;


//Q5. Encapsulation Example (Student Class) (OOPs – Encapsulation)
//Description:
//Create a Student class with private fields name and age.
//Use getters and setters to access them.

public class Student {

	private String name;
	private int age;
	//Setter
	public void setName(String name) {
		
		this.name = name;
		
	}
	
	
	public void setAge(int age) {
		
		this.age = age;
		
	}
	
	//Getter
	
	public String getName() {
		
		return name;
		
	}
	
	
public int getAge() {
		
		return age;
		
	}
	
	
	
}
