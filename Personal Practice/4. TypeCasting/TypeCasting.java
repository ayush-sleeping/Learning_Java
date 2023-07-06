

public class TypeCasting {
	public static void main(String[] args) {
	
	/* Java type casting refers to the process of converting one data type to another. 
	 * It allows you to treat a variable of one type as if it were another type.
	 */	
	
	// There are two types of type casting in Java:
	
	/* Implicit Casting (Widening):
	       It occurs when you convert a smaller data type to a larger data type.
	       It happens automatically without any explicit code.
	       It is safe because there is no loss of data. */
	
	int num = 10;
	double decimalNum = num; // Implicit casting from int to double

	System.out.println("num: " + num); // Output: num: 10
	System.out.println("decimalNum: " + decimalNum); // Output: decimalNum: 10.0
	   
	   
	 /*  Explicit Casting (Narrowing):
	       It occurs when you convert a larger data type to a smaller data type.
	       It requires explicit code using parentheses and the target type.
	       It may lead to data loss or precision loss.
	 */
	
	double decimalNum2 = 3.14;
	int num2 = (int) decimalNum2; // Explicit casting from double to int

	System.out.println("decimalNum2: " + decimalNum2); // Output: decimalNum: 3.14
	System.out.println("num2: " + num2); // Output: num: 3


   }
}
