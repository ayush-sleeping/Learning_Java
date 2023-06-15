
public class operators {
	// Operators are used to perform operations on variables and values.
	public static void main(String[] args) {
		// In the example below, we use the + operator to add together two values:
		int x = 100 + 645;
		System.out.println(x);
		
		/*
		 Arithmetic Operators [Arithmetic operators are used to perform common mathematical operations.] :
		 + , - , * , / , % (Modulus) , ++ , -- .
		 
		 Assignment Operators [Assignment operators are used to assign values to variables.] :
		 = , += , -= , *= , /= , %= , &= , |= , ^= , >>= , <<= 
		 
		 Comparison Operators [Comparison operators are used to compare two values (or variables).] :
		 == , != , > , < , >= , <= 
		 
		 Logical Operators [Logical operators are used to determine the logic between variables or values] :
		 && , || , ! 
		 */
		
		int a = 12;
		a++; // a = a + 1;
		System.out.println(a);
		
		
//		Logical Operator :  
//		&& , || , !  (And, or, not)
		
		int age = 52;
		if(age > 18 && age < 50) {
			System.out.println("YOu can Vote");
		} else {
			System.out.println("YOu can not vote");
		}
	}
 
}
