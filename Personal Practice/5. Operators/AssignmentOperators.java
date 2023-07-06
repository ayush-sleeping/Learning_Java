
public class AssignmentOperators {
	
	/* Assignment Operators [Assignment operators are used to assign values to variables.] :
		 = , += , -= , *= , /= , %= , &= , |= , ^= , >>= , <<= 
    */
	

    public static void main(String[] args) {
        int num = 10;
        
        // Addition assignment operator (+=)
        num += 5; // Equivalent to: num = num + 5
        System.out.println("After addition: " + num); // Output: After addition: 15
        
        // Subtraction assignment operator (-=)
        num -= 3; // Equivalent to: num = num - 3
        System.out.println("After subtraction: " + num); // Output: After subtraction: 12
        
        // Multiplication assignment operator (*=)
        num *= 2; // Equivalent to: num = num * 2
        System.out.println("After multiplication: " + num); // Output: After multiplication: 24
        
        // Division assignment operator (/=)
        num /= 4; // Equivalent to: num = num / 4
        System.out.println("After division: " + num); // Output: After division: 6
        
        // Modulus assignment operator (%=)
        num %= 2; // Equivalent to: num = num % 2
        System.out.println("After modulus: " + num); // Output: After modulus: 0
    }

}
