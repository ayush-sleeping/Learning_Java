
public class DoWhile_Loop {
	
	/* The do-while loop is similar to the while loop, 
	 * but it checks the condition after each iteration.
	 * It guarantees that the code block will be executed at least once.
	 
	
	 * he do/while loop is a variant of the while loop. 
	 * This loop will execute the code block once, 
	 * before checking if the condition is true, 
	 * then it will repeat the loop as long as the condition is true.
	 */
	

    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Count: " + i);
            i++;  // After each iteration, i is incremented
        } while (i <= 5); // loop continues as long as i is less than or equal to 5.
    }

    /* The loop will always execute the code block at least once 
     * because the condition is checked at the end. */
}


/* Loops provide a powerful way to repeat code execution 
 * and iterate over collections or arrays in Java. 
 * The choice of loop depends on the specific requirement 
 * and the condition that needs to be evaluated.
 */