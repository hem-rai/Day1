package data.structure;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
	
	ArrayList<String> name = new ArrayList<>();
		
		name.add("Hem");
		name.add("Prem");
		name.add("Amar");
		
	
		Iterator<String> itr = name.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
