package data.structure;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		
		ArrayList<String> arr1 = new ArrayList<>();
		
		arr1.add("Hem");
		arr1.add("Prem");
		arr1.add("Amar");
		
		System.out.println(arr1);
		
		
	ArrayList<String> cars = new ArrayList<>();
		
		cars.add("Nissan");
		cars.add("Toyota");
		cars.add("Ford");
		cars.add("Volvo");
		cars.add(0, "BMW"); //we can insert element at the beginning of the list 
		
		
		System.out.println(cars);
		
		System.out.println(cars.get(1));
		
		cars.set(0, "Lexus");
		
		System.out.println(cars);
		cars.remove(0);
		System.out.println(cars);
		
		cars.clear();
		System.out.println(cars);
		
		cars.add("Nissan");
		cars.add("Toyota");
		cars.add("Ford");
		cars.add("Volvo");
		cars.add(0, "BMW"); 
		System.out.println(cars.size());
		
		//for loop
		for (int i =0; i<cars.size(); i++) {
			
			System.out.println(cars.get(i));
		}
		System.out.println("-------------");
		//for each loop
		
		for (String i : cars) {
			System.out.println(i);
		}
		
		//Sorting arrays
		
		Collections.sort(cars);
		 
		System.out.println(cars);
		
		for (String i : cars) {
			System.out.println(i);
		}
		
		
	ArrayList<Integer> age = new ArrayList<>();
		
		age.add(34);
		age.add(24);
		age.add(53);
		age.add(24);
		age.add(35);
		age.add(63);
		age.add(24);
	
		Collections.sort(age);
		
		for (int x : age) {
			System.out.println(x);
		}
		
	}

}
