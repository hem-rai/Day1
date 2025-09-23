package array.list;

import java.util.Objects;

public class Employee {

	
	String name;
	int age;
	int salary;
	

    public Employee() {
    	
    	this.name = "Unknown";
    	this.age = 18;
    	this.salary = 45000;
  
    }

    // Parameterized constructor
    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
	
    
    public Employee(int age, int salary) {
      
        this.age = age;
        this.salary = salary;
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(name, other.name) && salary == other.salary;
	}
	
	


}
