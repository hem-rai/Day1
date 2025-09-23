package data.structure;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo2 {

	public static void main(String[] args) {

		
		// HashMap<Integer, String> hmap1 = new HashMap<>(); //This creates an empty hashmap
		
		
		
		Map<Integer, String> hmap1 = new HashMap<>(); //better
		
	       hmap1.put(1312, "Hem");
	       hmap1.put(112, "Ram");
	       hmap1.put(132, "Shayam");
	       hmap1.put(131, "Jhuma");
	       hmap1.put(12, "Aman");
	       hmap1.put(12, "Jina");
		
		System.out.println(hmap1);
		
		
		
		Map<String, String> hmap2 = new HashMap<>(); //better
		
	       hmap2.put("1312", "Hem");
	       hmap2.put("112", "Hem");
	       hmap2.put("132", "Hem");
	       hmap2.put("131", "Hem");
	       hmap2.put("312", "Hem");
	       hmap2.put("312", "Hem");
		
		System.out.println(hmap2);
		
		
		System.out.println(hmap1.get(132)); //Shayam
		
		System.out.println(hmap1.containsKey(100));
		System.out.println(hmap1.containsKey(12));
		
		System.out.println(hmap1.containsValue("Reshma"));
		System.out.println(hmap1.containsValue("Aman")); //replace by Jina
		System.out.println(hmap1.containsValue("Hem"));

		
		System.out.println(hmap1.size());
		Set<Integer> seOfKeys=hmap1.keySet();
		
	}

}
