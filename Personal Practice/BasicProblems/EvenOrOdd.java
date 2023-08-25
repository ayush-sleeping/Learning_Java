package BasicProblems;

// Check if a NUmber is Even or Odd ::

import java.util.*;
public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number:");
		int num = sc.nextInt();
		
		//CHecking if a number is even or odd ::
		if(num % 2 == 0) {
			System.out.println(num + " is even");
		} else {
			System.out.println(num + " is odd");
		}
		
		sc.close();
	}

}
