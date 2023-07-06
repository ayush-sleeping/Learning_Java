
public class Booleans {
	
	/* 
	 * Booleans in Java represent logical values of either true or false.
	 * They are often used in decision-making and control flow statements.
	 * Booleans are commonly used to store the result of comparisons or 
	 * to control the execution of code based on certain conditions.
	 */
	

    public static void main(String[] args) {
        boolean isRaining = true; // Declare and initialize a boolean variable

        if (isRaining) {
            System.out.println("It is raining!"); // Output: It is raining!
        } else {
            System.out.println("It is not raining.");
        }

        int age = 18;
        boolean isAdult = age >= 18; // Comparing age to determine if person is an adult

        if (isAdult) {
            System.out.println("You are an adult."); // Output: You are an adult.
        } else {
            System.out.println("You are not an adult yet.");
        }
    }
}
