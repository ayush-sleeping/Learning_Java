
public class Recursion {
	
	/* Recursion is a technique where a method calls itself to solve a problem
	      by breaking it down into smaller subproblems.
	 * It involves a base case that stops the recursive calls 
	      and a recursive case that makes the method call itself.*/


    public static int factorial(int n) // a factorial method that calculates the factorial of a given number using recursion.
    {
        if (n == 0) {
            return 1; // Base case: factorial of 0 is 1
        } else {
            return n * factorial(n - 1); // Recursive case: multiply n by factorial of (n-1)
        }
    }
    
    // The method calls itself with a smaller number until it reaches the base case (factorial of 0 is 1).

    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println("Factorial: " + result); // Output: Factorial: 120
    }
}
