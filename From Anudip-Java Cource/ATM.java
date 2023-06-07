import java.util.Scanner;

public class ATM {
    private static double balance = 4740; // Initial balance

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ATM menu 
        System.out.println("Welcome to the ATM");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        
        
        // Here using "Do while" and "Switch cases" :
        int choice;
        do {
            System.out.print("What you want to do: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    deposit(input); // Call the deposit method
                    break;
                case 2:
                    withdraw(input); // Call the withdraw method
                    break;
                case 3:
                    checkBalance(); // Call the checkBalance method
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM !"); // exit and show this message .
                    break;
                default:
                    System.out.println("Invalid choice. Please try again."); // other than 1,2,3,4 options, If anyone chooses
            }
        } while (choice != 4); //process continues until the user enters a choice equal to 4, which corresponds to the "Exit"option.

        input.close(); // to close the Scanner object 
    }

    
    
    // Method to handle deposit functionality
    public static void deposit(Scanner input) {
    	
    	//User is prompted to enter the amount to deposit.
        System.out.print("Enter the amount to deposit: "); 
        double amount = input.nextDouble();
        
        //The input amount is added to the balance using the += operator.
        balance += amount;                // Add the deposit amount to the balance
        
        //A success message is printed with the deposited amount.
        System.out.println("Deposit of " + amount + " successful.");
        
        //The updated balance is displayed.
        System.out.println("Updated balance: " + balance);
    }

    
    
    // Method to handle withdraw functionality
    public static void withdraw(Scanner input) {
    	
    	//User is prompted to enter the amount to withdraw.
        System.out.print("Enter the amount to withdraw: ");
        double amount = input.nextDouble();
        
        //code checks if the withdrawal amount is greater than the balance.
        if (amount > balance) {
        	//If the amount is greater, an insufficient balance message is displayed.
            System.out.println("Insufficient balance. Unable to withdraw.");          
        } else {
        	
        	// If the amount is within the balance, the withdrawal amount is subtracted from the balance using the -= operator.
            balance -= amount;
            //withdrawal amount is subtracted from the balance.
            
            //success message is printed with the withdrawn amount.
            System.out.println("Withdrawal of " + amount + " successful.");
            
            //updated balance is displayed.
            System.out.println("Updated balance: " + balance);
        }
    }

    
    
    // Method to check and display the current balance
    public static void checkBalance() {
        System.out.println("Current balance: " + balance); //The current balance is displayed.
    }
}

