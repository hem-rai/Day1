package array.list;
import java.util.ArrayList;
import java.util.List;

import java.util.Collections;


public class EmployeeMain {

	public static void main(String[] args) {

	/*	Employee emp1 = new Employee();
		
		
		System.out.println(emp1.name);
		System.out.println(emp1.age);
		System.out.println(emp1.salary);
		
		*/
		
		Employee emp2 = new Employee("Prakash", 24, 5000);
		Employee emp3 = new Employee("Deepa", 28, 6000);
		Employee emp4 = new Employee("Rohan", 34, 3000);
		Employee emp5 = new Employee("Janak", 19, 8000);
		Employee emp6 = new Employee("Prakash", 24, 5000);

		
		
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);

	
		
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		System.out.println(empList); //it prints all detail of array if toString () method is applied
		
		
		System.out.println(emp2.equals(emp4)); //it prints false 
		
		
		System.out.println(emp2.equals(emp6)); //it also prints false unless you Override equals() to compare values instead of memory reference.
		
		//Collections.sort(empList);
		
	}

}
