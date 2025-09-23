package exception.handling;

import java.util.Scanner;

public class CustomException {

	public static void main(String[] args) {

		System.out.println("Enter the guest name: ");
		Scanner input = new Scanner(System.in);

		String enteredName = input.nextLine();

		try {

			if (enteredName.equals("prakash")) {
				Exception exception = new Exception("Sorry, Prakash is not allowed.");
				throw exception;

			}
		}

		catch (Exception e) {

			System.out.println(e.getMessage());

			return;
		}
		System.out.println("Welcome " + enteredName);
	}

}
