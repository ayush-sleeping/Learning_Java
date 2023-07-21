
public class Main {
    public static void main(String[] args) {
    	// Creating a new instance of the Student class & assigning it to variable student.
        Student student = new Student("Ayush", 20, "Above 8.5 SGPI");
        
        /* In the constructor of the Student class, provided name "Ayush" is passed to the super keyword,
         * which calls the constructor of the Person class and sets the name attribute to "Ayush" */

        student.speak(); // Call the speak method of the Person class
        student.study(); // Call the study method of the Student class
    }
}
