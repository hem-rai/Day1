package laborday.assignment;

import java.util.Scanner;

public class PriimeNumber {

	static boolean isPrime(int num) {

		if (num <= 1) {
			return false;
		}

		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				return false;
			}

		}
		return true;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number");

		int number = sc.nextInt();

		if (isPrime(number)) {
			System.out.println("The number you entered is a prime number.");
		} else {
			System.out.println("The number you entered is not a prime number.");
		}

	}

}
