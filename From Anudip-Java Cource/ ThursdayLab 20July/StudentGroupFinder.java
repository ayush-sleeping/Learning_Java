package ThursdayLab_20July;

/* Q)   A class teacher has decided to split her entire class into four groups, 
        namely Sapphire, Perl, Ruby, and Emerald for sports competitions. 
        For dividing the students into these four groups, she has followed the pattern given below:
Sapphire - 1, 5, 9, 13, 17, 21, ...
Perl - 2, 6, 10, 14, 18, 22, ...
Ruby - 3, 7, 11, 15, 19, 23, ...
Emerald - 4, 8, 12, 16, 20, 24, ...
        All the students are represented by their roll numbers. Based on the above pattern, 
        given the roll number as input, print the group the student belongs to. 
        Note that the roll number can be any positive integer and not necessarily less than 25. */


import java.util.InputMismatchException;
import java.util.Scanner;


// Enum to represent the group names ::
enum GroupName {
    SAPPHIRE, PERL, RUBY, EMERALD
}


//---------------------------------------------------------------------------------------------------------
public class StudentGroupFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Adding Input Validation for roll number ::
        int rollNumber = getInput(sc);

        // groupNumber calculated from the roll number is used to get the corresponding group name from the enum ::
        int groupNumber = (rollNumber - 1) % 4;

        // Get the corresponding group name from the enum ::
        String groupName = GroupName.values()[groupNumber].toString();

        // Output Formatting ::
        System.out.println("**************************************");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Group Name: " + groupName);
        System.out.println("**************************************");

        sc.close();
    }


// ---------------------------------------------------------------------------------------------------------   
    // Method for Input Validation ::
    private static int getInput(Scanner sc) {
    	// getInput that takes scanner as input & ensures that *user enters only integer values for roll no. :: 
        
    	int rollNumber = 0;
        // This variable will store the user's input for the roll number ::
        boolean validInput = false;
        // This variable will be used to control the loop and ensure that the user enters only valid input ::

        while (!validInput) {
            try {
                System.out.print("Enter the roll number of the student: ");
                rollNumber = sc.nextInt();
                // This line attempts to read an integer from the user ::
                validInput = true;
                // If the user enters a valid integer, and the loop will stop ::
            } catch (InputMismatchException e) {
                // Handling non-integer input ::
                System.out.println("Invalid input! Please enter an integer value.");
                sc.nextLine(); // Clearing the input buffer ::
            }
        }

// ---------------------------------------------------------------------------------------------------------
        return rollNumber;
        
    }
}
