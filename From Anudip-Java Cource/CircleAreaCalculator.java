import java.util.Scanner;

public class CircleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String choice = "";

        do {
            // Prompt the user to calculate the area of a circle
            System.out.print("Do you want to calculate the area of a circle? (yes/no): ");
            choice = input.next();

            if (choice.equalsIgnoreCase("yes")) {
                // If user wants to calculate, prompt for the radius of the circle
                System.out.print("Enter the radius of the circle: ");
                double radius = input.nextDouble();

                // Calculate the area of the circle using the formula: pi * radius^2
                double area = Math.PI * radius * radius;

                // Display the calculated area of the circle
                System.out.println("The area of the circle is: " + area);
            }
        } while (choice.equalsIgnoreCase("yes"));

        // Display "Program finished" message after the user decides not to calculate anymore
        System.out.println("Program finished.");
    }
}


