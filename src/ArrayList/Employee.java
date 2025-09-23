package ArrayList;

public class Employee {
	String name;
	int age;
	int salary;

	public Employee(String name, int age, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", salary=" + salary + "]";
	}
	
	
//	@Override
//	public int compareTo(Employee o) {
//	    return this.salary - o.salary;  //compares on the basis of salary and print (ascending order)
	
	// return o.salary - this.salary;  //on the basis of descending order
	
	//For Custom comparing > Comparator
	
	//For Default comparing > Comparable
//	}

	

}
