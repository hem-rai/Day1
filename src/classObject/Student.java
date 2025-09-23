package classObject;

public class Student {
	
	String name;
	String grade;
	int Id;
	
	
	//Default constructor
	
	public Student() {

		name = "Default name";
		grade = "Default grade";
	    Id= 0;

	}
	
	
	
//Parameterized constructor
	public Student(String name, String grade, int Id) {

		this.name = name;
		this.grade = grade;
		this.Id= Id;

	}
	
	
    public String play() {
        return name + " is playing.";
    }
	


}
