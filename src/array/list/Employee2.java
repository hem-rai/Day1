package array.list;

import java.util.Objects;

public class Employee2 implements Comparable<Employee2> {

	
	String name;
	int age;
	int salary;
	



    // Parameterized constructor
    public Employee2(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
	
    

	@Override
	public String toString() {
		return "Employee2 [name=" + name + ", age=" + age + ", salary=" + salary + "]";
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
		Employee2 other = (Employee2) obj;
		return age == other.age && Objects.equals(name, other.name) && salary == other.salary;
	}
	
	
	
	@Override
	public int compareTo(Employee2 other) {
		return Integer.compare(this.salary,  other.salary);
	}


}
