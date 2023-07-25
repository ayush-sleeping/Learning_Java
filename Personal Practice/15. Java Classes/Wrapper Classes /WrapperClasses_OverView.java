package Wrapper_Classes;


/* Java Wrapper Classes :
   are classes that allow you to work with primitive data types as objects. 
   In Java, primitive data types (like int, double, char, etc.) are not considered objects, 
   but there are situations where you may need to treat them as objects. 
   
   
   Wrapper classes provide a way to convert between primitive data types and objects.  */


/* There are eight wrapper classes in Java, each corresponding to a primitive data type:
     
   Byte:    Wrapper for byte
   Short:   Wrapper for short
   Integer: Wrapper for int
   Long:    Wrapper for long
   Float:   Wrapper for float
   Double:  Wrapper for double
   Character: Wrapper for char
   Boolean: Wrapper for boolean 

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WrapperClasses_OverView {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        
	        // Converting Primitives to Objects
	        int myInt = 42;
	        Integer myInteger = Integer.valueOf(myInt);

	        
	        // Converting Objects to Primitives (Unboxing)
	        Integer myInteger2 = Integer.valueOf(42);
	        int myInt2 = myInteger2.intValue();

	        
	        // Autoboxing and Autounboxing
	        int x = 10; // Autoboxing
	        Integer y = x; // Autoboxing

	        
	        Integer z = 20; // Autounboxing
	        int w = z; // Autounboxing

	        
	        // Null Values
	        Integer myNullableInteger = null; // Valid
	        // int myNullInt = null; // Error

	        
	        // Using Wrapper Classes in Collections
	        List<Integer> numbers = new ArrayList<>();
	        numbers.add(10);
	        numbers.add(20);

	        // Printing the values
	        System.out.println("myInt: " + myInt);
	        System.out.println("myInteger: " + myInteger);
	        System.out.println("myInt2: " + myInt2);
	        System.out.println("x: " + x);
	        System.out.println("y: " + y);
	        System.out.println("z: " + z);
	        System.out.println("w: " + w);
	        System.out.println("myNullableInteger: " + myNullableInteger);
	        System.out.println("numbers: " + numbers);

	        
	        // Passing Objects by Reference
	        someMethod(42);
	        
	     // Close the scanner
	        scanner.close();
	    }
	    
	    
	    public static void someMethod(Integer number) {
	        // Code here
	    }

}
