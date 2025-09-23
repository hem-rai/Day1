package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {

		ArrayList alist1 = new ArrayList(); //


		
		System.out.println(alist1);
		alist1.add(10);
		alist1.add(20);
		alist1.add(30);
		alist1.add(40);

		System.out.println(alist1); //

		ArrayList alist2 = new ArrayList(); //

		System.out.println(alist2);
		alist2.add("Depa");
		alist2.add("Rohan");
		alist2.add("Shankhar");
		alist2.add(2000);

		System.out.println(alist2); //

		ArrayList<String> alist3 = new ArrayList<>(); //

		System.out.println(alist3);
		alist3.add("Depa");
		alist3.add("Rohan");
		alist3.add("Shankhar");

		// alist3.add(2000); //error

		System.out.println(alist3); //

		ArrayList<Integer> alist4 = new ArrayList<>(); // Integer is a class name

		// alist4.add("Depa");
		// alist4.add("Rohan");
		// alist4.add("Shankhar");

		alist4.add(2000); // error

		System.out.println(alist4); //

		// List is more powerful then other

		List<Integer> alist5 = new ArrayList<>(); // For List we have to import java.util.List

		// alist5.add("Depa");
		// alist5.add("Rohan");
		// alist5.add("Shankhar");

		alist5.add(5000); // error

		System.out.println(alist5); //

		List<Integer> alist6 = new ArrayList<>(); // For List we have to import java.util.List

		alist6.add(200);
		alist6.add(300);
		alist6.add(400);
		alist6.add(500);

		System.out.println(alist6);

		System.out.println(alist6.get(0));
		System.out.println(alist6.get(3));
		System.out.println(alist6.size());
		alist6.remove(0);

		System.out.println(alist6);
		System.out.println(alist6.get(2));

		System.out.println(alist6.contains(50)); // false
		System.out.println(alist6.contains(300)); // true

		
		Collections.sort(alist6);
		System.out.println(alist6);
		
		
		
		
		
		
	}

}
