package Inheritance;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 18, "12th");

        student.speak(); // Call the speak method of the Person class
        student.study(); // Call the study method of the Student class
    }
}
