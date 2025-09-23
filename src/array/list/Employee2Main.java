package array.list;
import java.util.ArrayList;
import java.util.List;

import java.util.Collections;


public class Employee2Main {

	public static void main(String[] args) {


		Employee2 emp2 = new Employee2("Prakash", 24, 5000);
		Employee2 emp3 = new Employee2("Deepa", 28, 6000);
		Employee2 emp4 = new Employee2("Rohan", 34, 3000);
		Employee2 emp5 = new Employee2("Janak", 19, 8000);
		Employee2 emp6 = new Employee2("Prakash", 24, 5000);

		
		
		System.out.println(emp2);
		System.out.println(emp3);
		System.out.println(emp4);
		System.out.println(emp5);

	
		
		
		List<Employee2> empList = new ArrayList<>();
		
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		
		System.out.println(empList); //it prints all detail of array if toString () method is applied
		
		
		System.out.println(emp2.equals(emp4)); //it prints false 
		
		
		System.out.println(emp2.equals(emp6)); //it also prints false unless you Override equals() to compare values instead of memory reference.
		
		Collections.sort(empList);
		
		 System.out.println("Sorted by salary: " + empList); //
		
	}

}
