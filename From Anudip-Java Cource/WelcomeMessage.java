import java.util.Scanner;

public class WelcomeMessage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Create a welcome message by concatenating the name with a predefined string
        String welcomeMessage = "Welcome, " + name + "!";

        // Display the welcome message
        System.out.println(welcomeMessage);
    }
}
