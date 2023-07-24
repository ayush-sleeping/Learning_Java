package User_Input_Scanner;

/* Java User Input, also known as Scanner, 
   is a way to read data from the user during the execution of a Java program. 
   It allows the program to interact with the user by reading values entered from the keyboard. */

/* To use the Scanner class, you need to import it from the java.util package. 
   Then, you can create an instance of the Scanner class to read user input.  */

import java.util.Scanner;

public class UserInput_Scanner {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        // This line reads an integer value entered by the user and stores it in the variable.

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.println("Select an operation (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        // This line reads next token (a string) entered by the user & stores its first character in variable operator.

        int result = 0;
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator.");
        }

        System.out.println("Result: " + result);

        // Close the Scanner object to release resources
        scanner.close();
    }
    
    /* The program reads two integer numbers and an arithmetic operator (+, -, *, or /) entered by the user. 
       It then performs the corresponding operation and displays the result. 
       The Scanner class helps to read and parse user input, making the program interactive and dynamic.*/
}






