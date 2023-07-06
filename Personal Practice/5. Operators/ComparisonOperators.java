
public class ComparisonOperators {
	
	/* Comparison Operators [Comparison operators are used to compare two values (or variables).] :
		 == , != , > , < , >= , <= 
     */
	

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        
        // Equality operator (==)
        boolean isEqual = num1 == num2;
        System.out.println("Equality: " + isEqual); // Output: Equality: false
        
        // Inequality operator (!=)
        boolean isNotEqual = num1 != num2;
        System.out.println("Inequality: " + isNotEqual); // Output: Inequality: true
        
        // Greater than operator (>)
        boolean isGreaterThan = num1 > num2;
        System.out.println("Greater than: " + isGreaterThan); // Output: Greater than: true
        
        // Less than operator (<)
        boolean isLessThan = num1 < num2;
        System.out.println("Less than: " + isLessThan); // Output: Less than: false
        
        // Greater than or equal to operator (>=)
        boolean isGreaterThanOrEqual = num1 >= num2;
        System.out.println("Greater than or equal to: " + isGreaterThanOrEqual); // Output: Greater than or equal to: true
        
        // Less than or equal to operator (<=)
        boolean isLessThanOrEqual = num1 <= num2;
        System.out.println("Less than or equal to: " + isLessThanOrEqual); // Output: Less than or equal to: false
    }

}
