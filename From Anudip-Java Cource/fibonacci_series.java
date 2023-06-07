import java.util.Scanner;

public class fibonacci_series {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numTerms = input.nextInt();
        input.close();

        int firstTerm = 0;
        int secondTerm = 1;
        System.out.println("Fibonacci series:");

        // Display the first two terms
        System.out.print(firstTerm + " " + secondTerm + " ");

        // Generate the Fibonacci series for the remaining terms
        for (int i = 3; i <= numTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.print(nextTerm + " ");

            // Update the values for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

