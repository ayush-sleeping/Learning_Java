import java.util.Scanner;

public class dowhile_guessinggame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretNumber = 42;
        int guess;

        do {
            System.out.print("Guess the number (between 1 and 100): ");
            guess = scanner.nextInt();

            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number.");
            }
        } while (guess != secretNumber);
    }
}