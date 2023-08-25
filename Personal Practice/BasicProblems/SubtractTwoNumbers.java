package BasicProblems;

// Subtract Two numbers ::


import java.util.*;
public class SubtractTwoNumbers {
	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the first number:");
		int num1 = scanner.nextInt();
		
		System.out.print("Enter the second number:");
		int num2 = scanner.nextInt();
		
		// Calculate the difference of the two numbers ::
		int difference = num1 - num2;
		
		System.out.print("Result:"+ difference);
		
		scanner.close();
		
		
	}
	

}
