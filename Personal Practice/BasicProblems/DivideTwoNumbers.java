package BasicProblems;

// Division of Two Numbers ::

import java.util.*;
public class DivideTwoNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENter the dividend:");
		double dividend = sc.nextDouble();
				
		System.out.print("ENter the divisor:");
		double divisor = sc.nextDouble();
		
		 // Calculate the quotient of the division
		double quotient = dividend / divisor;
		
		System.out.print("Result:" + quotient);
		
		sc.close();
	}

}
