package data.structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MostFreqentElement {

	public static void main(String[] args) {

		int[] nums = {1,2,2,3,3,3};
		
		Map<Integer, Integer>freq = new HashMap<>();
	
		int maxFreq = 0, result = -1;
		for (int num : nums) {
			
			int count = freq.getOrDefault(num, 0)+ 1;
			
			freq.put(num,  count);
			
			if(count> maxFreq) {
				
				maxFreq = count;
				result = num;
			}
		}
		
		System.out.println(" Most Frequent: " + result);

	}

}
