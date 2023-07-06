
public class ContinueStatement {
	
	/* The continue statement is used to skip the rest of the loop body 
	 * for the current iteration and proceed to the next iteration.
	  
	 
	 * The continue statement breaks one iteration (in the loop), 
	 * if a specified condition occurs, and continues with the next iteration in the loop.
	 */
	

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) // for loop to print the numbers from 1 to 5
        	{
            if (i == 3) // i is equal to 3, we encounter the continue statement
            {
                continue; // Skip the rest of the loop body when i is 3 and proceed to the next iteration
            }
            System.out.println("Count: " + i);
        }
    }

}
