package Classes_and_Objects;

public class ClassMethods {
	
	/* Class methods :
	   are functions that are defined within a class and can perform specific actions or operations. 
	   They are associated with the class itself rather than individual objects of the class.*/


    // Class method to calculate the sum of two numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Class method to calculate the product of two numbers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // It serves as the entry point of the program. It is also a class method :
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;

        /* Calling class methods
           We then call the sum method by using the class name " ClassMethods " 
           followed by the method name sum, multiply and pass num1 and num2 as arguments. 
           The result is stored in the result1 and result2 variable. */
        
        int result1 = ClassMethods.sum(num1, num2);
        int result2 = ClassMethods.multiply(num1, num2);

        System.out.println("Sum: " + result1);
        System.out.println("Product: " + result2);
    }
    
    /* Class methods are useful when we want to perform operations 
     * that are not specific to individual objects but are associated with the class as a whole. 
     * They allow us to organize and encapsulate related functionality within the class. */
    
}
