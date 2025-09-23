package hascode;

import java.util.Comparator;

public class SortDescendingComparator implements Comparator<Integer> {
    
    @Override
    public int compare(Integer o1, Integer o2) {
        return Integer.compare(o2, o1); // safer than o2 - o1
    }
}
