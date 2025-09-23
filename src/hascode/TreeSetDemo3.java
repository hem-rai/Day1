package hascode;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo3 {

    public static void main(String[] args) {
        
        Set<Integer> tset1 = new TreeSet<>();
        
        tset1.add(10);
        tset1.add(20);
        tset1.add(50);
        tset1.add(30);
        tset1.add(50); // duplicate ignored
        
        System.out.println("Default ascending order: " + tset1);
        
        // Use custom comparator
        Set<Integer> sortDescending = new TreeSet<>(new SortDescendingComparator());
        sortDescending.addAll(tset1);
        System.out.println("Custom descending order: " + sortDescending);
    }
}
