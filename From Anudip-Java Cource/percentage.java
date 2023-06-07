import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        int numStudents = 3;
        int numSubjects = 5;
        int[][] marks = new int[numStudents][numSubjects];
        double[] percentages = new double[numStudents];

        Scanner input = new Scanner(System.in);

        // Input marks for each student and subject
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < numSubjects; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                marks[i][j] = input.nextInt();
            }
        }

        // Calculate percentage for each student
        for (int i = 0; i < numStudents; i++) {
            int totalMarks = 0;
            for (int j = 0; j < numSubjects; j++) {
                totalMarks += marks[i][j];
            }
            percentages[i] = (double) totalMarks / numSubjects;
        }

        // Display the percentages
        System.out.println("Percentage of Subject Marks:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ": " + percentages[i] + "%");
        }
    }
}
