
public class Class {
	
	/* A class in Java is a blueprint or template that defines the structure and behavior of objects.
	 * It encapsulates data (variables) and methods (functions) that operate on that data.*/
	
	    // Instance variables
	// Inside the Class class, there are two instance variables: brand and color.
	    String brand;
	    String color;

	    // Method
	    public void startEngine() {
	        System.out.println("Engine started!");
	    }

	    // Main method ( The main method is the entry point of the program. )
	    public static void main(String[] args) {
	        // Creating an object of the Car class
	    	Class myCar = new Class();
	    	
	    	
	        // Accessing instance variables and calling methods
	        myCar.brand = "Toyota";
	        myCar.color = "Red";
	        System.out.println("My car brand: " + myCar.brand);
	        System.out.println("My car color: " + myCar.color);
	        myCar.startEngine();
	    }
	    
	    /* The usage of the keyword class in this program is for defining a class, 
	     * creating an object of that class, and accessing the instance variables 
	     * and methods of the class.
	     */
}
