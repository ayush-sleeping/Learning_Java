package BasicProblems;

// Add Two Numbers ::


import java.util.*;

public class AddTwoNumbers {
	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = scanner.nextInt();
		
		int sum = num1 + num2;
		System.out.println("Result: "+ sum);
		
		scanner.close();
	}

}

/*
 * How to proceed ::
     Create a Scanner object to read input from the user
     Prompt the user to enter the first number
     Prompt the user to enter the second number
     Calculate the sum of the two numbers
     Display the result
     Close the scanner to release resources
     
  */
