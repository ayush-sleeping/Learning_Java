import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        int numStudents = 2;
        int numSubjects = 3;
        int[][] marks = new int[numStudents][numSubjects];
        double[] averages = new double[numStudents];

        Scanner input = new Scanner(System.in);

        // Input marks for each student and subject
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = input.nextInt();
            }
        }

        // Calculate average for each student
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = 0;
            for (int j = 0; j < numSubjects; j++) {
                totalMarks += marks[i][j];
            }
            averages[i] = (double) totalMarks / numSubjects;
        }

        // Display the averages
        System.out.println("Average Subject Marks:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + averages[i]);
        }
    }
}
