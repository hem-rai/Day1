package classObject;

public class Employee {
	
	
	String name;
	int empid;
	int salary;
	int age;
	String address;
	
	//Default /no argument constructor
	public Employee() {
	
	
	}

//parameterized constructor

	public Employee(String name, int empid, int salary) {
		
	
		this.name = name;
		this.empid = empid;
		this.salary = salary;
		
		
	}
	
	//Constructor overloading
	
	public Employee(int empid, String name, int salary) {
		
		this.empid = empid;
		this.name = name;
		this.salary = salary;
		
		
	}
	
	
	
	public Employee(int age, String address) {
		
		this.age = age;
		this.address = address;
		
		
	}
	
	
	
	
	
	
	
	void eat() {
		System.out.println("Employee is eating");
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empid=" + empid + ", salary=" + salary + "]";
	}
	
	
	
	

}
