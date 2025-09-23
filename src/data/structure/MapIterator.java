package data.structure;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIterator {

    public static void main(String[] args) {

        Map<Integer, String> hmap1 = new HashMap<>();

        hmap1.put(1312, "Hem");
        hmap1.put(112, "Ram");
        hmap1.put(132, "Shayam");
        hmap1.put(131, "Jhuma");
        hmap1.put(12, "Aman");
        hmap1.put(12, "Jina"); // overwrites "Aman"

        // Iterating with entrySet()
        System.out.println("Using entrySet():");
        Set<Entry<Integer, String>> setOfEntry = hmap1.entrySet();
        for (Entry<Integer, String> entry : setOfEntry) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Iterating with keySet()
        System.out.println("\nUsing keySet():");
        for (Integer key : hmap1.keySet()) {
            System.out.println(key + " -> " + hmap1.get(key));
        }

        // Iterating with values()
        System.out.println("\nUsing values():");
        for (String value : hmap1.values()) {
            System.out.println(value);
        }
    }
}
