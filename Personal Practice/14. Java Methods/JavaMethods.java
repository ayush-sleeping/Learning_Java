
public class JavaMethods {
	
	/* Methods in Java are blocks of code that perform specific tasks 
	       and can be called and executed when needed.
	 * You can pass data, known as parameters, into a method.
	 * They allow code reuse, modularity, and organization of functionality.
	 * Methods are used to perform certain actions, and they are also known as functions.
	 */



	  static void myMethod() {
	    System.out.println("Learning Java Methods!");
	  }

	  
    // Method definition
    public static void sayHello() {
        System.out.println("Hello, World!");
    }
    /* sayHello() is a void method that does not return a value. 
     * It simply prints "Hello, World!" to the console when called.*/

    
    public static int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;
    }
    /* sayHello() is a void method that does not return a value. 
     * It simply prints "Hello, World!" to the console when called.*/

    
    // Main method
    public static void main(String[] args) {
        sayHello(); // Calling the sayHello method

        int result = addNumbers(5, 10); // Calling the addNumbers method
        System.out.println("Sum: " + result); // Output: Sum: 15
        
        myMethod();
    }
}
