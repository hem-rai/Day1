package hascode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
	
	
	Set<Integer>hset1 = new HashSet<>(); 
	
	
	hset1.add(10);
	hset1.add(20);
	hset1.add(50);
	hset1.add(30);
	hset1.add(50);
	
	System.out.println(hset1);
	
	
	Set<String> hset2 = new HashSet<>(); 
	
	
	hset2.add("Depa");
	hset2.add("Sandip");
	hset2.add("Rohan");
	hset2.add("Sankhar");
	hset2.add("Suja");
	
	System.out.println(hset2);

	
Set<String> hset3 = new HashSet<>(); //empty HashSet
	
	
	hset3.add("Prem");
	hset3.add("Dan");
	hset3.add("Anjali");
	hset3.add("Pukar");
	hset3.add("jina");
	
	//using for each loop
	
	for(String element:hset3) {
		
		System.out.println(element);
	}
	
	
	//using Iterator
	
	Set<Integer>hset4 = new HashSet<>(); 
	
	
	hset4.add(10);
	hset4.add(20);
	hset4.add(50);
	hset4.add(30);
	hset4.add(50);
	
	
	Iterator<Integer> itr =hset4.iterator();
	
	while(itr.hasNext()) {
		Integer i = itr.next();
		System.out.println(i);
	}
	
	}

}
