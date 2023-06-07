import java.util.Scanner;

public class factorial {
    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();

        int factorialResult = factorial(number);
        System.out.println("The factorial of " + number + " is: " + factorialResult);
    }
}