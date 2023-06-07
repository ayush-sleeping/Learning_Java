import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a palindrome
        boolean isPalindrome = checkPalindrome(number);

        // Display the result
        if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    // Function to check if a number is a palindrome
    public static boolean checkPalindrome(int number) {
        // Store the original number
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Check if the reversed number is equal to the original number
        if (originalNumber == reversedNumber) {
            return true; // The number is a palindrome
        } else {
            return false; // The number is not a palindrome
        }
    }
}
