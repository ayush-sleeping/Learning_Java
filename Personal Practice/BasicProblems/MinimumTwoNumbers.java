package BasicProblems;

// Minimum of Two Numbers ::

import java.util.*;
public class MinimumTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        
        // Determine the minimum of the two numbers ::
        int min = Math.min(num1, num2);
        
        System.out.print("Result:" + min);
        
        sc.close();
	}

}
