
public class WhileLoop {
	
	/* 
	 * The while loop is used to execute a block of code repeatedly 
	 * as long as a specified condition is true.
	 * It checks the condition before each iteration.
	 */
	

    public static void main(String[] args) {
        int i = 1;  // initialize i with 1
        while (i <= 5) //  loop continues as long as i is less than or equal to 5
        {
            System.out.println("Count: " + i);
            i++;  // After each iteration, i is incremented by 1
        }
    }
}


/* Loops provide a powerful way to repeat code execution 
 * and iterate over collections or arrays in Java. 
 * The choice of loop depends on the specific requirement 
 * and the condition that needs to be evaluated.
 */