package corejava;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
	
			int a = 22;
			int b = 88;
			int sum= a+b;
			System.out.println("The sum of  a and b is ---> " + sum);
			System.out.println(a+ b);
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println(" Enter the first number");
			
			int num1 = sc.nextInt();
			System.out.println(" Enter the second number");
			int num2 = sc.nextInt();
			
			int add= num1 +num2;
			System.out.println("The sum of  first number and second number is ---> " + add);
		
			
	}
}
