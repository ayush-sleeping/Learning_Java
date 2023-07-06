
public class Scope {
	
	/* Scope refers to the visibility and accessibility of variables within different parts of the code.
	 * Variables declared inside a block or method have limited scope 
	   and can only be accessed within that block or method.*/


    public static void printNumber() // a method printNumber that declares a local variable number. 
    {
        int number = 10; // Local variable within the method
        System.out.println("Number:" + number); // Output: Number: 10
    }
    
    /* The number variable is only accessible within the printNumber method 
       and cannot be accessed outside of it. */

    public static void main(String[] args) {
        // number variable cannot be accessed here
        printNumber(); // Calling the method
    }
}

/* Method Scope :
 * Variables declared directly inside a method are available anywhere in the method 
        following the line of code in which they were declared. */


/* Block Scope: 
 * A block of code refers to all of the code between curly braces {}.
 * Variables declared inside blocks of code are only accessible by the code 
        between the curly braces, which follows the line in which the variable was declared. */
