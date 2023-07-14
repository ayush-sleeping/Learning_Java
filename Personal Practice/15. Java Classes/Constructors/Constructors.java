package Constructors;
public class Constructors {
	
	/* A constructor in Java is a special method that is used to initialize objects of a class.
	 * It is called automatically when an object is created ( when an object is created using the new keyword.) .
	 * It can be used to set initial values for object attributes.
   * [ Constructors have the same name as the class and do not have a return type, not even void. ]
	 */

	/* define a constructor that takes parameters name and age to initialize the object's state. */
	 String name;
	    int age;
 
	    // Constructor ( Create a class constructor for the Main class )
	    public Constructors(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    public static void main(String[] args) {
	        // Creating objects using the constructor
	    	Constructors person1 = new Constructors("Ahan", 25);
	    	Constructors person2 = new Constructors("Ayush", 30);

	        // Accessing instance variables
	        System.out.println(person1.name + " is " + person1.age + " years old.");
	        System.out.println(person2.name + " is " + person2.age + " years old.");
	    }
  
	/* Constructors are useful for ensuring that objects are properly initialized 
 and allowing flexibility in object creation by providing different options for initialization. */
  
}

