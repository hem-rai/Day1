package hascode;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
public class Empty {

	public static void main(String[] args) {
		
		
	Set<Integer> hset1 = new HashSet<>();
		
		hset1.add(10);
		hset1.add(20);
		hset1.add(50);
		hset1.add(30);
		hset1.add(50);
		
		System.out.println(hset1);
		
		Set<Integer> tset2 = new TreeSet<>(hset1);
		
		System.out.println(tset2);
		
		
	}

}
