package BasicProblems;

// Check if a Number is Prime ::

import java.util.*;
public class PrimeNumber {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        //CHeck if number is prime or not ::
        boolean isPrime = isPrimeNumber(num);
        /* program then calls the isPrimeNumber method with the entered number 
           to determine whether it's a prime number.
        */
        if (isPrime) {
        	System.out.println(num + " is a Prime Number.");
        } else {
        	System.out.println(num + " is not a Prime.");
        }
		sc.close();
	}
	
	
	/*
	 isPrimeNumber method takes an integer num as an argument and returns a boolean value 
	 indicating whether num is a prime number. */
	static boolean isPrimeNumber(int num) {
		if (num <= 1) { // less than or equal to 1.
			return false;
		}
		
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
/*
 The loop condition is i <= Math.sqrt(num). 
 This condition is used to limit the loop to run only until the square root of num. 
 Why the square root? Because if a number num is not a prime, 
 it can be factored into two integers, say a and b, where 1 < a <= b < num. 
 If both a and b are greater than the square root of num, then a * b would be greater than num, 
 which contradicts the assumption that a * b = num. 
 
 Therefore, at least one of a or b must be less than or equal to the square root of num, 
 ensuring that we don't need to check factors beyond the square root.*/





