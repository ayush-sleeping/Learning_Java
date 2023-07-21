
public class BankAccountExample {
    public static void main(String[] args) {
    	// Create an object of the CheckingAccount class with default PIN number (0)
        CheckingAccount checkingAccount = new CheckingAccount(0, "SBI", "Ayush"); 
        checkingAccount.displayAccountInfo(); // Call the displayAccountInfo() method to display account information
    	// here "new" is indicating that a new object of the CheckingAccount class will be created.
     	 
     	 /* In the constructor of the CheckingAccount class, provided Bank name "SBI" is passed 
     	  * to the super keyword, 
     	  * which calls the constructor of the Bank Account class and sets the Bank name attribute to "SBI"
     	  */
    	  

        int newPinNo = 1234; // Get the new PIN number from the user
        checkingAccount.setPinNo(newPinNo); // Set the new PIN number using the setter method

        checkingAccount.deposit(510); // Call the deposit() method to deposit an amount
        checkingAccount.withdraw(200); // Call the withdraw() method to withdraw an amount
    }
}