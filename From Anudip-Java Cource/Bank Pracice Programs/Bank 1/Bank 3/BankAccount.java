
// Parent class representing a bank account
public abstract class BankAccount {
	// Encapsulation: Private instance variables
    private String accountNumber;
    private String bankName;
    private String accountHolderName;
    private int pinNo;
    private double balance;
    /* Private instance variables (accountNumber, bankName, accountHolderName, 
     * pinNo, balance) with public getter and setter methods to control access to the data.*/

 // Encapsulation: Getter and Setter methods
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getPinNo() {
        return pinNo;
    }

    public void setPinNo(int pinNo) {
        this.pinNo = pinNo;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    // Abstraction: Abstract method to withdraw money
    public abstract void withdraw(double amount);
}
