package ArrayList;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Collections; 
public class CustomClass {

	public static void main(String[] args) {
		
	
		Employee emp1 = new Employee("Prakash", 21, 400);
		Employee emp2 = new Employee("Deepa", 16, 500);
		Employee emp3 = new Employee("Rohan", 17, 600);
		
		
		
		List<Employee> empList = new ArrayList<>();
		
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		
		System.out.println(empList);
		
		
		//Collections.sort(empList);
		
		

	}

}
