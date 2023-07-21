public class BankAccount {
    private int pinNo; // Private attribute to store the PIN number
    private String bankName; // Private attribute to store the bank name
    private String accountHolderName; // Private attribute to store the account holder name

    public BankAccount(int pinNo, String bankName, String accountHolderName) {
        this.pinNo = pinNo; // Initialize the PIN number with the provided value
        this.bankName = bankName; // Initialize the bank name with the provided value
        this.accountHolderName = accountHolderName; // Initialize the account holder name with the provided value
    }

    public int getPinNo() {
        return pinNo; // Return the PIN number
    }

    public void setPinNo(int pinNo) {
        int oldPinNo = this.pinNo; // Store the old PIN number
        this.pinNo = pinNo; // Set the PIN number with the provided value
        System.out.println("Old PIN: " + oldPinNo + ", New PIN: " + this.pinNo); // Print the old and new PIN numbers
    }

    public void displayAccountInfo() {
        System.out.println("Bank Name: " + bankName); // Print the bank name
        System.out.println("Account Holder Name: " + accountHolderName); // Print the account holder name
    }
}
