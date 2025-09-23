package classObject;

public class EmplyeeMain {

	public static void main(String[] args) {

		
		
		Employee emp1 = new Employee(  "Sangam", 456, 75000);
		
		Employee emp2 = new Employee(  "Mahesh", 457, 600000);
		
		Employee emp3 = new Employee(  "Rakesh", 458, 800000);
		
		
		
		Employee emp4 = new Employee( 45,"Sunnyside");
		

		Employee emp5 = new Employee( 458, "Rakesh", 800000);
		
		System.out.println(emp1.name + " " + emp1.empid + " " + emp1.salary);
		System.out.println(emp2.name + " " + emp2.empid + " " + emp2.salary);
		System.out.println(emp3.name + " " + emp3.empid + " " + emp3.salary);
		System.out.println( emp4.age + " " + emp4.address);
		
		System.out.println(emp1);
		
		System.out.println(emp2);
		System.out.println(emp3);
		
		
		
	}

}
