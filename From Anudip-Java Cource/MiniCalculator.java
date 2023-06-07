import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = input.nextDouble();

        // Prompt the user to select an operation
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice (1-4): ");
        int choice = input.nextInt();

        // Perform the selected operation and display the result
        double result = 0.0; // variable to store the result of the operation
        String operation = ""; // variable to store the name of the operation

        switch (choice) {
            case 1:
                // Addition operation
                result = num1 + num2;
                operation = "addition";
                break;
            case 2:
                // Subtraction operation
                result = num1 - num2;
                operation = "subtraction";
                break;
            case 3:
                // Multiplication operation
                result = num1 * num2;
                operation = "multiplication";
                break;
            case 4:
                // Division operation
                result = num1 / num2;
                operation = "division";
                break;
            default:
                // Invalid choice
                System.out.println("Invalid choice.");
                return; // Exit the program if the choice is invalid
        }

        // Display the result
        System.out.println("The result of " + operation + " is: " + result);
    }
}
