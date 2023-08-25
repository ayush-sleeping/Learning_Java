package BasicProblems;

//Maximum of Two Numbers ::

import java.util.*;
public class MaximumTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number:");
		int num1 = sc.nextInt();
		
		System.out.print("Enter the second number:");
		int num2 = sc.nextInt();
		
		  // Determine the maximum of the two numbers ::
		int max = Math.max(num1, num2);
		System.out.print("Result:" + max);
		
		sc.close();
	}
 
}
