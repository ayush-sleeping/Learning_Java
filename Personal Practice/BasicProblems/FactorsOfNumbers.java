package BasicProblems;

// Find the Factors of a Number ::

import java.util.*;
public class FactorsOfNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		
		System.out.println("Factors of " + num + ":");
		// Find and print factors of the number ::
		for(int i = 1; i<=num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
	}

}
