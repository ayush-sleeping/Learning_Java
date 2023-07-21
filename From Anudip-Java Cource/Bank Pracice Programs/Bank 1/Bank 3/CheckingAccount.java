

// Child class representing a checking account
public class CheckingAccount extends BankAccount {
	 /* Inheritance: Inherits from the parent class BankAccount 
	  * The CheckingAccount class extends the BankAccount class, 
	  * inheriting its attributes and methods.*/

    // Constructor
    public CheckingAccount(String accountNumber, String bankName, String accountHolderName, int pinNo, double balance) {
        setAccountNumber(accountNumber);
        setBankName(bankName);
        setAccountHolderName(accountHolderName);
        setPinNo(pinNo);
        setBalance(balance);
    }

    // Polymorphism: Overrides the withdraw method from the parent class
    @Override
    public void withdraw(double amount) {
    	/* The BankAccount class contains an abstract method withdraw, 
    	 * which is implemented in the CheckingAccount class.*/
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Amount withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
