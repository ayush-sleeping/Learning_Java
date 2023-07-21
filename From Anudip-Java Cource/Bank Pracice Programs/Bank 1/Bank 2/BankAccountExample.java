// Main Class :
import java.util.Scanner;
public class BankAccountExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter account details
        System.out.print("Enter account number: ");
        String accountNo = input.nextLine();

        System.out.print("Enter bank name: ");
        String bankName = input.nextLine();

        System.out.print("Enter account holder name: ");
        String accountHolderName = input.nextLine();

        System.out.print("Enter PIN number: ");
        int pinNo = input.nextInt();
        
        

     
        // Create a CheckingAccount object using the provided details
        CheckingAccount account = new CheckingAccount(accountNo, bankName, accountHolderName, pinNo);

        
        
        // Display the account information
        System.out.println("Account Information:");
        System.out.println("Account Number: " + account.getAccountNo());
        System.out.println("Bank Name: " + account.getBankName());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());

        
        
        // Prompt the user to enter the deposit amount and perform the deposit
        System.out.print("Enter the amount to deposit: ");
        double depositAmount = input.nextDouble();
        account.deposit(depositAmount);

        
        
        // Prompt the user to enter the withdrawal amount and perform the withdrawal
        System.out.print("Enter the amount to withdraw: ");
        double withdrawalAmount = input.nextDouble();
        account.withdraw(withdrawalAmount);

        
        
        // Display the remaining balance in the account
        double balance = account.getBalance();
        System.out.println("Remaining balance: " + balance);

        input.close();
    }
}