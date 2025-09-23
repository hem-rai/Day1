package hascode;

import java.util.HashSet;
import java.util.Set;
public class HashsetDemo3 {

	public static void main(String[] args) {

		
		Dog1 d1 = new Dog1("Tommy", 11, 700);
		Dog1 d2 = new Dog1("Jacky", 11, 500);
		Dog1 d3 = new Dog1("Sweet", 13, 800);
		Dog1 d4 = new Dog1("Tommy", 11, 700);

		//HashSet <Dog1> hset1 = new HashSet<>();
		
		Set<Dog1> hset1 = new HashSet<>();
		
		hset1.add(d1);
		hset1.add(d2);
		hset1.add(d3);
		hset1.add(d4);
		
		System.out.println(hset1);
		
		

		
		
		
		
		
	}

}
