import java.util.*;

public class DescendingOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accept the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        // Create an array to store the numbers
        int[] numbers = new int[size];

        // Accept the numbers from the user
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {  // Read numbers from input by user and storing them
            numbers[i] = input.nextInt();
        }

        // Sort the numbers in descending order
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    // Swap the numbers if they are in the wrong order
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Display the numbers in descending order
        System.out.println("Numbers in descending order:");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        input.close();
    }
}
