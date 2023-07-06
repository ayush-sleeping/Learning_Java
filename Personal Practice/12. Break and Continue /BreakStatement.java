
public class BreakStatement {
	
	/* The break statement is used to exit a loop prematurely based on a certain condition.
	 * It is typically used within for, while, or do-while loops.
	 
	 * It was used to "jump out" of a switch statement.
	 */	

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) // Using a for loop to print the numbers from 1 to 5
        	{
            if (i == 3) // when i is equal to 3, we encounter the break statement,
            {
                break; // Exit the loop when i is 3
            }
            System.out.println("Count: " + i);
        }
    }
}
