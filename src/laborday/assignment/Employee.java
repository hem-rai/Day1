package laborday.assignment;

public class Employee {

	String name;
	int age;
	int salary;

	Employee() {

		name = "Unknown";
		age = 18;
		salary = 1400;

		System.out.println("No arguement constructor is called.");
	}

	Employee(String name, int age, int salary) {

		this.name = name;
		this.age = age;
		this.salary = salary;
		System.out.println("Parameterized constructor is called.");
	}

}
