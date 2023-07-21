public class MainProgram {

    public static void main(String[] args) {
        try {
            // Create and start EligibilityCheck thread
            EligibilityCheck eligibilityCheck = new EligibilityCheck();
            eligibilityCheck.start();
            
            // Wait for EligibilityCheck thread to complete
            eligibilityCheck.join();

            // Create and start SalaryCalculation thread
            SalaryCalculation salaryCalculation = new SalaryCalculation();
            salaryCalculation.start();
            
            // Wait for SalaryCalculation thread to complete
            salaryCalculation.join();
            
            // Create and start AmountReceived thread
            AmountReceived amountReceived = new AmountReceived();
            amountReceived.start();
        } 
        
        catch (Exception e) {
            System.out.println("An error occurred in the main program.");
            e.printStackTrace();
            
            /* this catch block provides a way to handle any unexpected exceptions.
             */
        }
    }
}