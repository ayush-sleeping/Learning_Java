package Inheritance;

public class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void study() {
        System.out.println("I am a student in grade " + grade + " and I am studying.");
    }
}
