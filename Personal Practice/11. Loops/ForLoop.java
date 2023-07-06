
public class ForLoop {
	
	/* 
	 * The for loop is used to execute a block of code repeatedly for a specified number of iterations.
	 * It consists of an initialization, a condition, and an increment or decrement expression.
	 */

	public static void main(String[] args) {
        for (int i = 1; i <= 5; i++)
        /* he loop starts with i = 1, continues as long as i is less than or equal to 5, 
         * and increments i by 1 after each iteration.
         */	
        	
        {
            System.out.println("Count: " + i);
        }
    }
	
	/* When you know exactly how many times you want to loop through a block of code, 
	 * use the for loop */
}

/* Loops provide a powerful way to repeat code execution 
 * and iterate over collections or arrays in Java. 
 * The choice of loop depends on the specific requirement 
 * and the condition that needs to be evaluated.
 */