// Parent CLass :

class BankAccount {
	private String accountNo; // Private attribute to store account number
    private String bankName; // Private attribute to store bank name
    private String accountHolderName; // Private attribute to store account holder name
    private int pinNo; // Private attribute to store PIN number
    protected double balance; // Protected attribute to store account balance
    
 // The balance attribute is declared as 'protected' to make it accessible to subclasses (e.g., CheckingAccount) 
 // and any other classes within the same package. This allows subclasses to directly access and modify the balance.

    
    // Constructor to initialize the BankAccount object with provided details
    public BankAccount(String accountNo, String bankName, String accountHolderName, int pinNo) {
        this.accountNo = accountNo;
        this.bankName = bankName;
        this.accountHolderName = accountHolderName;
        this.pinNo = pinNo;
        this.balance = 0.0; // Initially, the balance is set to 0
    }


    // Getter and setter methods for account attributes
    
    /* By providing a getter method, other classes can retrieve the account number 
     * without directly accessing the attribute
     */
    public String getAccountNo() {
        return accountNo; 
        
     /* The use of return in this method indicates that the method will return the value 
      * of the accountNo attribute to the caller.  */
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
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

 // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount; // Increase the balance by the deposit amount
        System.out.println("Deposit successful. New balance: " + balance);
    }
}
