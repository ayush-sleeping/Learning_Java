package ThursdayLab_20July;

/* Q)Create a Student class and create an array list to add 10 student objects 
 * and print them using a for each loop */


import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int Rollno;
    private String name;

    
// ---------------------------------------------------------------------------------------------------------
    // constructor of the Student class ::
    public Student(int Rollno, String name) {
    // It is used to initialize the instance variables of the class with the values provided as arguments ::
        this.Rollno = Rollno;
        this.name = name;
    }

    /*  it overrides the toString() method to provide a custom string representation of a Student object 
        -- when it is printed.  :: 
     */  
    @Override
    public String toString() {
        return "Student ID: " + Rollno + ", Name: " + name;
    }
}


//---------------------------------------------------------------------------------------------------------
public class StudentList {
    public static void main(String[] args) {
        // Create an ArrayList to store Student objects ::
        ArrayList<Student> studentList = new ArrayList<>();

        // Add 10 students to the ArrayList ::
        System.out.println("Enter details for 10 students:");

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Student " + i + ":");
            
            // Read student ID from user input ::
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();

            // Read student name from user input ::
            System.out.print("Enter Name: ");
            sc.nextLine(); // Consume the newline character left by nextInt() ::
            String name = sc.nextLine();

            // Create a new Student object and add it to the list ::
            studentList.add(new Student(id, name));
            System.out.println("Student details added successfully.\n");
        }

        
// ---------------------------------------------------------------------------------------------------------
        // Print the details of each student using a for-each loop ::
        System.out.println("\nDetails of Students:");
        for (Student student : studentList) {
            System.out.println(student);
        }

        // Closing the Scanner ::
        sc.close();
    }
}
