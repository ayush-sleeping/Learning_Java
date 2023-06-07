import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

      //asking and accept the how many numbers user want to calculate :
        System.out.print("Enter the number of values: "); 
        int numValues = input.nextInt();

        int[] numbers = new int[numValues];

        // Input the numbers
        // here store every value of that particular number :
        System.out.println("Enter the numbers:");
        for (int i = 0; i < numValues; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Now here starts Calculating the greatest, smallest, average, and sum :
        int greatest = numbers[0];
        int smallest = numbers[0];
        int sum = numbers[0];
        for (int i = 1; i < numValues; i++) {
            // Check if the current number is greater than the current greatest number
            if (numbers[i] > greatest) {
                greatest = numbers[i];  // Update the greatest number
            }

            // Check if the current number is smaller than the current smallest number
            if (numbers[i] < smallest) {
                smallest = numbers[i];  // Update the smallest number
            }

            sum += numbers[i];  // Add the current number to the sum
        }
        double average = (double) sum / numValues;  // Calculate the average 

        // Display the results (OUTPUT)
        System.out.println("Greatest Number: " + greatest);
        System.out.println("Smallest Number: " + smallest);
        System.out.println("Average: " + average);
        System.out.println("Sum: " + sum);
    }
}
