
import java.util.Scanner;

public class EligibilityCheck extends Thread {
    public void run() {
        try {
        	// Prompt user to check eligibility
            System.out.println("Are you an Indian? (Yes/No)");
            
            // Read user input
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            
            // Check if user is eligible
            if (answer.equalsIgnoreCase("Yes")) {
            	// User is eligible, continue with the program
                System.out.println("You are eligible for paying tax in India.");
            } else {
            	// User is not eligible, stop the program
                System.out.println("You are not eligible for paying tax in India.");
                System.exit(0); // Terminate the program
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
            /* this catch block provides a way to handle any unexpected exceptions 
               that may occur during the execution of the try block.
             */
        }
    }
}
