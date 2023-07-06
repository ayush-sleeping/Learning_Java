
public class MethodOverloading {
	
	/* Method overloading allows you to define multiple methods 
	           with the same name but different parameter lists.
	 * The methods can have different numbers or types of parameters.*/


    public static int addNumbers(int a, int b) {
        return a + b;
    }

    public static double addNumbers(double a, double b) {
        return a + b;
    }
    
    /* we have two addNumbers methods. One takes two int parameters, 
          and the other takes two double parameters. 
     * This demonstrates method overloading, where we can use the same method name 
          but with different parameter types to perform different tasks.
     */

    public static void main(String[] args) {
        int sum1 = addNumbers(5, 10);
        System.out.println("Sum1: " + sum1); // Output: Sum1: 15

        double sum2 = addNumbers(3.14, 2.5);
        System.out.println("Sum2: " + sum2); // Output: Sum2: 5.64
    }
}
