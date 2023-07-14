package Modifiers;

public class Modifiers {
	
	/* Modifiers are keywords that are used to specify 
	     the scope, accessibility, and behavior of classes, methods, variables, and other program elements. 
	      
<!-------------------------------------------------------------------------------------------------------->

	     
	 There are several types of modifiers in Java:
	 
	 * Access Modifiers ( controls the access level ):
	 
	      - public: 
	      The public modifier allows the element to be accessed from anywhere.
	      
	      - protected: 
	      The protected modifier allows the element to be accessed within the same package or subclasses.
	      
	      - private: 
	      The private modifier restricts the accessibility of the element to the class itself.
	      
	      - Default (no modifier specified): Allows access within the same package only.
	  
	  
	 * Non-Access Modifiers ( do not control access level, but provides other functionality ):
	 
	 1. Class Modifiers:	 
	  - abstract: The abstract modifier is used to declare abstract classes 
	       that cannot be instantiated but can be subclassed. 
	 
	  - final: The final modifier applied to a class indicates that the class cannot be subclassed.
	
	  - strictfp: The strictfp modifier can be applied to classes to ensure 
	      consistent floating-point calculations across different platforms.
	 
	 2. Method Modifiers:	 
	  - abstract: The abstract modifier applied to a method indicates 
	      that the method is declared in an abstract class and must be implemented by its subclasses.
	
	  - final: The final modifier applied to a method indicates that the method cannot be overridden in subclasses.
	
	  - synchronized: The synchronized modifier applied to a method ensures 
	      that only one thread can execute the method at a time.
	 
	  - native: The native modifier applied to a method indicates 
	      that the method is implemented in platform-specific code written in other languages.
	
	  - strictfp: The strictfp modifier applied to a method ensures 
	      consistent floating-point calculations within the method.
	 
	 3. Variable Modifiers:
	  - final: The final modifier applied to a variable indicates that its value cannot be modified once assigned.
	 
	  - volatile: The volatile modifier applied to a variable ensures 
	 that its value is always read from the main memory and not from a thread's cache.
	 
	  - transient: The transient modifier applied to a variable excludes it from the serialization process.
	 
	  - static: The static modifier applied to a variable makes 
	 it a class-level variable shared among all instances of the class.
	      
	      
<!-------------------------------------------------------------------------------------------------------->

	      
	 * Modifiers can be applied to classes, methods, variables, 
	             and other program elements to control their behavior and accessibility. 
	 * By using appropriate modifiers, you can enforce encapsulation, 
	             define access levels, and specify additional behaviors for your Java code.*/

}
