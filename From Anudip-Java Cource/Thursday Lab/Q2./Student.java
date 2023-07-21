
public class Student extends Person {
	public String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        /* This above line is calling subclass (Student), which is giving properties from its superclass (Person) */
        this.grade = grade; // Initialize the grade attribute with the given value
    }

    public void study() {
        System.out.println("I have completed my final year exams of BSc CS (3 - Year degree).");
        System.out.println("And I am expecting to get overall, " + grade); 
        // Printing the Study part "message" 
    }
}
