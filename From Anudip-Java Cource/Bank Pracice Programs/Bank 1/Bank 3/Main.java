import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter account details
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter bank name: ");
        String bankName = scanner.nextLine();
        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.nextLine();
        System.out.print("Enter PIN number: ");
        int pinNo = scanner.nextInt();

        // Polymorphism: Creating a CheckingAccount object using the provided details
        CheckingAccount account = new CheckingAccount(accountNumber, bankName, accountHolderName, pinNo, 5000.0);

        // Display the account information
        System.out.println("\nAccount Information:");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Bank Name: " + account.getBankName());
        System.out.println("Account Holder Name: " + account.getAccountHolderName());
        System.out.println("Balance: " + account.getBalance());

        // Prompt the user to choose deposit or withdrawal
        System.out.print("\nChoose an option:\n1. Deposit\n2. Withdraw\nEnter option: ");
        int option = scanner.nextInt();

        // Perform deposit or withdrawal based on the user's choice
        switch (option) {
            case 1:
                // Prompt the user to enter the deposit amount
                System.out.print("Enter the deposit amount: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                System.out.println("Deposit successful!");
                break;
            case 2:
                // Prompt the user to enter the withdrawal amount
                System.out.print("Enter the withdrawal amount: ");
                double withdrawalAmount = scanner.nextDouble();
                account.withdraw(withdrawalAmount);
                System.out.println("Withdrawal successful!");
                break;
            default:
                System.out.println("Invalid option!");
        }

        // Display the remaining balance in the account
        System.out.println("Remaining Balance: " + account.getBalance());

        scanner.close();
    }
}

