import java.util.Scanner;

public class BankingApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance = 0.0; // Initialize the balance to 0

        // Display the menu and prompt the user for their choice
        System.out.println("Welcome to the Banking Application!");
        System.out.println("Please select an option:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();

        // Process the user's choice
        switch (choice) {
            case 1:
                // Deposit
                System.out.print("Enter the amount to deposit: ");
                double depositAmount = input.nextDouble();
                balance += depositAmount; // Add the deposit amount to the balance
                System.out.println("Amount deposited successfully.");
                break;
            case 2:
                // Withdraw
                System.out.print("Enter the amount to withdraw: ");
                double withdrawAmount = input.nextDouble();
                if (withdrawAmount <= balance) {
                    balance -= withdrawAmount; // Subtract the withdrawal amount from the balance
                    System.out.println("Amount withdrawn successfully.");
                } else {
                    System.out.println("Insufficient balance.");
                }
                break;
            case 3:
                // Check Balance
                System.out.println("Your current balance is: " + balance);
                break;
            case 4:
                // Exit
                System.out.println("Thank you for using the Banking Application.");
                return; // Exit the program
            default:
                System.out.println("Invalid choice.");
                return; // Exit the program if the choice is invalid
        }

        // Display the updated balance
        System.out.println("Updated balance: " + balance);
    }
}
