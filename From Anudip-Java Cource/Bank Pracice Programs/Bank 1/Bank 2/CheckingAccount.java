
// Child class representing a checking account, inherits from BankAccount

class CheckingAccount extends BankAccount {
    public CheckingAccount(String accountNo, String bankName, String accountHolderName, int pinNo) {
        super(accountNo, bankName, accountHolderName, pinNo); // Call the parent class constructor
    }

 // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount; // Decrease the balance by the withdrawal amount
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal failed.");
        }
    }
}
