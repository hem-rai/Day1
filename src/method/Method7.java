






package method;

import java.util.Scanner;


public class Method7 {

	public static void main(String[] args) {

		// int[] numbers = { 10, 20, 30, 40, 25, 12 };
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("How many elements? ");
		
		int size = scanner.nextInt();
		
		
		int[] numbers = new int[size];
		
		System.out.println("Enter each element of the array.");
		
		for (int i=0; i < size; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		
		System.out.println("Sum of array: " + sumOfArray(numbers));
		System.out.println("Max of array: " + max(numbers));
		System.out.println("Min of array: " + min(numbers));
		
		
		
		   scanner.close();
		
	}

	static int sumOfArray(int[] nums) {
		int sum = 0;
		for (int num : nums) {
			sum = sum + num;
		}
		return sum;
	}

	static int max(int[] nums) {
		int max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
		}
		return max;
	}
	
	
	static int min(int[] nums) {
		int min = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		return min;
	}
	
	
	
	
}
