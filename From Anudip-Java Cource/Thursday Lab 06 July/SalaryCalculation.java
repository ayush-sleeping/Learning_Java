import java.util.Scanner;

public class SalaryCalculation extends Thread {

    public void run() {
        try {
            // Prompt user to provide PAN card number
            System.out.println("Please provide your PAN card number:");

            // Read user input
            Scanner scanner = new Scanner(System.in);
            String panCardNumber = scanner.nextLine();

            // Display PAN card number
            System.out.println("Your PAN card number: " + panCardNumber);

            // Prompt user to provide monthly salary
            System.out.println("Please provide your per month salary (in INR):");

            // Read user input
            double empSal = scanner.nextDouble();

            // Display monthly salary
            System.out.println("Your monthly salary is: " + empSal);

            
            // Calculate tax amount based on salary
            double taxAmount;
            if (empSal > 100000) {
                taxAmount = empSal * 0.08;
            } else if (empSal >= 50000 && empSal <= 100000) {
                taxAmount = empSal * 0.06;
            } else if (empSal >= 30000 && empSal < 50000) {
                taxAmount = empSal * 0.05;
            } else if (empSal >= 10000 && empSal < 30000) {
                taxAmount = empSal * 0.04;
            } else {
                throw new TaxNotEligibleException("The employee does not need to pay tax.");
            }

            
            // Display tax amount
            System.out.println("According to the latest tax rules, you have to pay: " + taxAmount);

            // Generate random account number
            long accountNumber = 13795;

            // Display account number for tax payment
            System.out.println("Please pay your tax amount to the following account number: " + accountNumber);
        } 
        
        
        catch (TaxNotEligibleException e) {
            System.out.println(e.getMessage());
            /* If this exception is thrown during the execution of the try block, 
               the code within this catch block will be executed. 
             */
        } 
        
        
        catch (Exception e) { 
        // If any exception other than TaxNotEligibleException is thrown, this catch block will be executed.
            System.out.println("An error occurred during salary calculation.");
            /* It simply prints a generic error message to the console indicating 
               that an error occurred during salary calculation. 
             */
        }
        
        
    }
    
    private class TaxNotEligibleException extends Exception {
        public TaxNotEligibleException(String message) {
            super(message);
            
            /* It has a constructor that takes a message parameter 
               and passes it to the Exception superclass constructor using super(message). 
               This allows the exception to store and provide a specific error message when it is thrown.
             */
        }
    }

}