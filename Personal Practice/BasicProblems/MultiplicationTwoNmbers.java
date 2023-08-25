package BasicProblems;

// Multiplication of Two Numbers ::

import java.util.*;
public class MultiplicationTwoNmbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number:");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter the second number:");
		int num2 = scanner.nextInt();
		
		// Calculate the product of the two numbers
		int product = num1 * num2;
		
		System.out.print("Result:" + product);
		
		scanner.close();
	}

}
