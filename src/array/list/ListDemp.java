package array.list;

import java.util.ArrayList;

import java.util.List;
import java.util.Iterator;

public class ListDemp {

	public static void main(String[] args) {

		List<Integer> alist1 = new ArrayList<>();

		alist1.add(200);
		alist1.add(300);
		alist1.add(100);
		alist1.add(400);
		System.out.println(alist1);

		System.out.println("-----------------");

		for (Integer element : alist1) {

			System.out.println(2 * element);
		}

		System.out.println("-----------------");

		for (int i = 0; i < alist1.size(); i++) {

			System.out.println(alist1.get(i));
		}

		System.out.println("Iteration using iterator");

		Iterator<Integer> itr = alist1.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
