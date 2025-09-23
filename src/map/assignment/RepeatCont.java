package map.assignment;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatCont {

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 1, 4, 2};

        // Declare and initialize the HashMap
        Map<Integer, Integer> freqMap = new HashMap<>();

        // Count frequencies
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        // Print the result
        System.out.println(freqMap);  // Output: {1=2, 2=3, 3=1, 4=1}
        
        String s = "swiss";

        // Declare and initialize the HashMap
        Map<Character, Integer> count = new LinkedHashMap<>();

        // Count frequencies
        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            
        	if(entry.getValue() == 1) {
        		
        		System.out.println("First non-repeating: " + entry.getKey());
        		break;
        	}
        	
        	
        }

        
        
    }
}
