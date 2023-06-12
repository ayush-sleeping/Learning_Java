import java.util.Scanner;

public class Acending_in_matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Accept the number of rows and columns from the user
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        // Create a 2D array to store the numbers
        int[][] numbers = new int[rows][columns];

        // Accept the numbers from the user
        System.out.println("Enter the numbers:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                numbers[i][j] = input.nextInt();
            }
        }

        // Arrange the numbers in ascending order
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < columns; j++) 
            {
                for (int k = 0; k < rows; k++) {
                    for (int l = 0; l < columns; l++) {
                        if (numbers[i][j] < numbers[k][l]) {
                            int temp = numbers[i][j];
                            numbers[i][j] = numbers[k][l];
                            numbers[k][l] = temp;
                        }
                    }
                }
            }
        }

        // Display the numbers in matrix format
        System.out.println("Numbers in ascending order (Matrix):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(numbers[i][j] + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}

