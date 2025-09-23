package laborday.assignment;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee myObj = new Employee();
		System.out.println(myObj.name);
		System.out.println(myObj.age);
		System.out.println(myObj.salary);

		Employee myObj2 = new Employee("Rajesh", 26, 15000);
		System.out.println(myObj2.name);
		System.out.println(myObj2.age);
		System.out.println(myObj2.salary);

	}

}
