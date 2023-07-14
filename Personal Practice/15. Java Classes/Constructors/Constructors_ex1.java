package Constructors;

public class Constructors_ex1 {
	
	/* Constructors can have parameters, 
	 * allowing you to pass values at the time of object creation. 
	 * They are used to set the initial state of an object by initializing its instance variables 
	 * or performing any other necessary setup. */

	// two private instance variables :
	private String name;
    private int age;
    
    // Constructor with parameters ( constructor has two parameters ) :
    public Constructors_ex1(String name, int age) {
        this.name = name;
        this.age = age;
        // "this" keyword is used to refer to the current object instance.
    }
    
    // Default constructor (constructor has no parameters.) :
    public Constructors_ex1() {
        this.name = "Unknown";
        this.age = 0;
        // This is the default constructor, which sets the name to "Unknown" and the age to 0.
    }
    
    // Getter methods [ allow us to retrieve the name and age values of a Person object. ] :
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public static void main(String[] args) {
        // Create objects using constructors
    	Constructors_ex1 person1 = new Constructors_ex1("Ayush", 25);
    	Constructors_ex1 person2 = new Constructors_ex1();
        
        // Accessing object properties
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
    }
}
