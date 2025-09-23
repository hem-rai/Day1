package data.structure;

import java.util.HashSet;
import java.util.Set;

public class DuplicateArray {

	public static void main(String[] args) {

		
	
		
		
		int[] arr = {2,4,6,7,6,5};
		
		Set<Integer>hset = new HashSet<>();
		boolean duplicate = false;
		for (int no : arr) {
		
			boolean isAdded = hset.add(no);
			if(isAdded == false) {
				
				System.out.println(no + " is duplicated first.");
				break;
			}
		
		}
		
		

	}

}
