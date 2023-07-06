
public class Constructors {
	
	/* A constructor in Java is a special method that is used to initialize objects of a class.
	 * It is called automatically when an object is created.
	 * It can be used to set initial values for object attributes.
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
	
}
