package exam;

import java.util.Scanner;

public class Main {

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n == 0 || n == 1) {  
            return 1;
        }
        return n * factorial(n - 1); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Q1. Reverse a String
        System.out.print("Enter your string: ");
        String mystring = scanner.nextLine();

        for (int i = mystring.length() - 1; i >= 0; i--) {
            System.out.print(mystring.charAt(i));
        }
        System.out.println("\n"); // newline after reversed string

        // Q2. Check Palindrome Number
        System.out.print("Enter a number to test Palindrome: ");
        int mynum = scanner.nextInt();

        int original = mynum;
        int reversed = 0;

        while (mynum > 0) {
            int mod = mynum % 10;
            reversed = reversed * 10 + mod;
            mynum = mynum / 10;
        }

        System.out.println("Reversed number: " + reversed);

        if (original == reversed) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is not a Palindrome.");
        }

        // Q3. Factorial Using Recursion
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();

        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);

      
        scanner.close();
    }
}
