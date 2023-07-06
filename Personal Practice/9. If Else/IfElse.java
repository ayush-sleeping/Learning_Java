
public class IfElse {
	
	/* 
	 * The if...else statement is used to perform different actions based on different conditions.
	 * It allows you to execute a block of code if a specified condition is true, 
	 * and another block of code if the condition is false.
	 */
	
    public static void main(String[] args) {
        int num = 10;

        if (num > 0) { // Check if num is greater than 0
            System.out.println("Number is positive."); // Output: Number is positive.
        } else {
            System.out.println("Number is non-positive.");
        }
        

        boolean isRaining = true; 
        // Declare and initialize a boolean variable

        // Using IF Else : 
        if (isRaining) {
            System.out.println("It is raining!"); 
            // Output: It is raining!
        } else {
            System.out.println("It is not raining.");
        }

        // Second Example :
        int age = 18;
        boolean isAdult = age >= 18; 
        // Comparing age to determine if person is an adult

        if (isAdult) {
            System.out.println("You are an adult."); 
            // Output: You are an adult.
        } else {
            System.out.println("You are not an adult yet.");
        }
    }
}
