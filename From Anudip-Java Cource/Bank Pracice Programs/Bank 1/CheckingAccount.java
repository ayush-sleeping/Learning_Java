
public class CheckingAccount extends BankAccount {
    public CheckingAccount(int pinNo, String bankName, String accountHolderName) {
        super(pinNo, bankName, accountHolderName);  // Call the parent class constructor to initialize attributes
    	/* This above line is calling subclass (Car), which is giving properties from its superclass (Vehicle) */
    }

    public void deposit(double amount) {
        System.out.println("Depositing $" + amount + " into the checking account."); // Print the deposit amount
    }

    public void withdraw(double amount) {
        System.out.println("Withdrawing $" + amount + " from the checking account."); // Print the withdrawal amount
    }
}
