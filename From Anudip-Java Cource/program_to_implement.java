import java.util.Scanner;

public class program_to_implement {
    
    static class AscendingOrder {
        // Method to sort the numbers in ascending order
        public static void sortAscending(int[] numbers) {
            // Sort the numbers in ascending order using Bubble Sort algorithm
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = 0; j < numbers.length - i - 1; j++) {
                    if (numbers[j] > numbers[j + 1]) {
                        // Swap the numbers if they are in the wrong order
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }
        }
    }

    static class DescendingOrder {
        // Method to sort the numbers in descending order
        public static void sortDescending(int[] numbers) {
            // Sort the numbers in descending order using Bubble Sort algorithm
            for (int i = 0; i < numbers.length - 1; i++) {
                for (int j = 0; j < numbers.length - i - 1; j++) {
                    if (numbers[j] < numbers[j + 1]) {
                        // Swap the numbers if they are in the wrong order
                        int temp = numbers[j];
                        numbers[j] = numbers[j + 1];
                        numbers[j + 1] = temp;
                    }
                }
            }
        }
    }

    static class GreatestNumber {
        // Method to find the greatest number
        public static int findGreatest(int[] numbers) {
            int greatest = numbers[0];
            // Find the greatest number by comparing each number with the current greatest
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > greatest) {
                    greatest = numbers[i];
                }
            }
            return greatest;
        }
    }

    static class SmallestNumber {
        // Method to find the smallest number
        public static int findSmallest(int[] numbers) {
            int smallest = numbers[0];
            // Find the smallest number by comparing each number with the current smallest
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < smallest) {
                    smallest = numbers[i];
                }
            }
            return smallest;
        }
    }

    static class AverageNumber {
        // Method to calculate the average of the numbers
        public static double calculateAverage(int[] numbers) {
            int sum = 0;
            // Calculate the sum of all the numbers
            for (int number : numbers) {
                sum += number;
            }
            // Calculate the average by dividing the sum by the number of elements
            return (double) sum / numbers.length;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accept the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = input.nextInt();

        // Create an array to store the numbers
        int[] abcd = new int[size];

        // Accept the numbers from the user
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            abcd[i] = input.nextInt();
        }

        // Sort the numbers in ascending order
        AscendingOrder.sortAscending(abcd);
        System.out.println("Numbers in ascending order:");
        for (int number : abcd) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Sort the numbers in descending order
        DescendingOrder.sortDescending(abcd);
        System.out.println("Numbers in descending order:");
        for (int number : abcd) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Find the greatest number
        int greatest = GreatestNumber.findGreatest(abcd);
        System.out.println("Greatest number: " + greatest);

        // Find the smallest number
        int smallest = SmallestNumber.findSmallest(abcd);
        System.out.println("Smallest number: " + smallest);

        // Calculate the average of the numbers
        double average = AverageNumber.calculateAverage(abcd);
        System.out.println("Average: " + average);

        input.close();
    }
}
