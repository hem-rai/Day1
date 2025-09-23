package lab.practice;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class FrameworkDemo {

	public static void main(String[] args) {

		List<Integer> arr1 = new ArrayList<>();

		arr1.add(20);
		arr1.add(30);
		arr1.add(40);
		arr1.add(62);
		arr1.add(10);
		arr1.add(62);

		System.out.println(arr1);

		System.out.println("-----------------");

		for (Integer x : arr1) {

			System.out.println(x);

		}
		System.out.println("using for loop");

		for (int i = 0; i < arr1.size(); i++) {

			System.out.println(arr1.get(i));

		}

		System.out.println("Iteration using iterator");

		Iterator<Integer> itr = arr1.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

	}

}
