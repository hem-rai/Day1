package arrays;

public class ArrayExample {

	public static void main(String[] args) {

		int[] num = new int[4];

		num[0] = 10;
		num[1] = 35;
		num[2] = 46;
		num[3] = 70;

		for (int i = 0; i < 4; i++) {

			System.out.println(num[i]);
		}

		int[] array1 = { 2, 4, 35, 67, 74, 36, 3, 7353, 53, 45, 35, 35, 46, 32, 5, 6, 43, 36, 47, 85 };

		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}

		// Using for each loops

		int[] array2 = { 588, 474, 854, 356, 254, 754, 865, 685, 456, 575 };

		for (int marks : array2) {

			System.out.println(marks);

		}

		String[] fruits = { "Apple", "Banana", "Cherry", "Date" };

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

		// Printing even numbers

		int[] array4 = { 2, 4, 35, 67, 56, 34 };

		for (int i = 0; i < array4.length; i++) {

			if (array4[i] % 2 == 0) {

				System.out.println("Even number :" + array4[i]);
			}

		}
		// Printing odd numbers

		for (int i = 0; i < array4.length; i++) {

			if (array4[i] % 2 != 0) {

				System.out.println("Odd number :" + array4[i]);
			}

		}

		// Average of array
		int sum = 0;
		for (int i = 0; i < array4.length; i++) {

			sum = sum + array4[i];

		}

		int ave = sum / array4.length;

		System.out.println("The average of array is: " + ave);

		// Max of array

		// int[] array4 = { 2, 4, 35, 67,56,34};

		int max = 0;

		for (int i = 0; i < array4.length; i++) {

			if (array4[i] > max) {

				max = array4[i];

			}

		}

		System.out.println("The max of array is :" + max);

		// Getting sum of array using for each loop

		int[] array5 = { 12, 34, 35, 67, 56, 34 };

		int sum5 = 0;

		for (int myarray : array5) {

			sum5 = sum5 + myarray;

		}

		System.out.println("The sum of my array is: " + sum5);

		int[] array6 = { 12, 34, 88, 35, 67, 56, 34, 23, };
		int max4 = 0;

		for (int myarray2 : array6) {

			if (myarray2 > max4) {

				max4 = myarray2;

			}

		}

		System.out.println("The max four of array is: " + max4);

		// Reverse array

		int[] array7 = { 12, 34, 88, 35, 67, 56, 34, 23 };

		for (int i = array7.length - 1; i >= 0; i--) {

			System.out.println(array7[i]);

		}
		
		//Counting repeated array
//		
//		int[] array8 = { 12, 34, 12, 35, 67, 56, 34, 23 };
//		int count = 0;
//		
//
//		for (int i = 0; i < array8.length; i++) {
//
//		
//			for (int j = 0; j < array8.length; j++) {
//				
//				if ( array8[i] == array8[j]) {
//					count = count + 1;
//				}
//				
//				System.out.println("The number "+ array8[i] + "is repeated "+ count);
//				
//			}
//			
//			
//
//	}	
		
		//Break
		
		for ( int i = 0; i < 10; i++) {
			if (i ==  4) {
				break;
			}
			
			
			
			
			System.out.println(i);
		}
	
		for ( int i = 0; i < 10; i++) {
			if (i ==  4) {
				continue; // it skips current iteration.
			}
			
			
			
			
			System.out.println(i);
		}
		
		
		
	       int[] array9 = { 12, 34, 12, 35, 67, 56, 34, 23 };
	        boolean[] visited = new boolean[array9.length];

	        for (int i = 0; i < array9.length; i++) {
	            if (visited[i]) continue; // skip already counted numbers

	            int count = 1; // start with 1 for the current element
	            for (int j = i + 1; j < array9.length; j++) {
	                if (array9[i] == array9[j]) {
	                    visited[j] = true; // mark as visited
	                    count++;
	                }
	            }

	            if (count > 1) {
	                System.out.println("The number " + array9[i] + " is repeated " + count + " times");
	            }
	        }
	    
	
		
		
//	
//	Q1.
//	 Write a Java program that prints numbers from 1 to 10.
//	If the number is 5, stop the loop using break.
//	If the number is 3, skip it using continue.
//	Print the output accordingly.
//	10:12
//	public class BreakContinueExample {
//	    public static void main(String[] args) {
//	        System.out.println("Numbers from 1 to 10 (skip 3, stop at 5):");
//	        for (int i = 1; i <= 10; i++) {
//	            if (i == 3) {
//	                System.out.println("Skipping number: " + i);
//	                continue; // skip the rest of the code for i = 3
//	            }
//	            if (i == 5) {
//	                System.out.println("Stopping at number: " + i);
//	                break; // exit the loop completely
//	            }
//	            System.out.println("Number: " + i);
//	        }
//	    }
//	}
//	10:13
//	Q2.
//	 Write a Java program that prints a multiplication table from 1 to 5 using nested loops.
//	If the product becomes greater than 12, stop printing further for that row using break.
//	If the multiplier is 3, skip printing that result using continue.
//	10:14
//	public class BreakContinueNestedExample {
//	    public static void main(String[] args) {
//	        for (int i = 1; i <= 5; i++) {
//	            System.out.println("Table of " + i + ":");
//	            for (int j = 1; j <= 5; j++) {
//	                if (j == 3) {
//	                    System.out.println("  Skipping multiplication with " + j);
//	                    continue; // skip this multiplication
//	                }
//	                int product = i * j;
//	                if (product > 12) {
//	                    System.out.println("  Product exceeded 12, stopping this row.");
//	                    break; // stop inner loop for this row
//	                }
//	                System.out.println("  " + i + " x " + j + " = " + product);
//	            }
//	            System.out.println();
//	        }
//	    }
//	}








		
		
		
		
		
		
	}
		

	}


