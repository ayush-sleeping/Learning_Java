
public class Person {
	public String name;
	public int age;

    public Person(String name, int age) {
        this.name = name; // Initialize the name attribute with the given value
        this.age = age; // Initialize the age attribute with the given value
    }

    public void speak() {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
        // Printing my short Intro. 
    }
}
