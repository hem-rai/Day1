package hascode;

import java.util.TreeSet;
import java.util.HashSet;
import java.util.Set;

public class TreeSetDemo {

	public static void main(String[] args) {

		//HashSet <Dog1> hset1 = new HashSet<>();
		
		Set<Integer> tset1 = new TreeSet<>();
		
		tset1.add(10);
		tset1.add(20);
		tset1.add(50);
		tset1.add(30);
		tset1.add(50);
		
		System.out.println(tset1);
		
		
		
		
		
		Set<String> tset2 = new TreeSet<>();
		
	tset2.add("Depa");
	tset2.add("Arjun");
	tset2.add("Mohan");
	tset2.add("Chandu");
	
	System.out.println(tset2);

	}

}
