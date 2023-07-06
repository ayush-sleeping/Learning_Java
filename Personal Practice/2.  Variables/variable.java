
public class variable {
	public static void main(String[] args) {
		
		// To store any value we use variables ( In example : Let x = something )
		// Here "x" is a variable name .
		
		/* Variable can be multiple types,
		  
		 * String - stores text, such as "Hello". String values are surrounded by double quotes
		 * int - stores integers (whole numbers), without decimals, such as 123 or -123
		 * float - stores floating point numbers, with decimals, such as 19.99 or -19.99
		 * char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
		 * boolean - stores values with two states: true or false
		 
		 */
		
		/* Syntax : 
		           type variableName = value;
		           First :  DataType name
		           Second : Variable name
		           Third : Variable's value
		           
		   Variable name RULES : 
		    only you can store _ , $ , AlphaNumeric characters are Alphabets and Digits .
		    and when you start naming any variable, You can only use Alphabets, _ , $ in starting of variable name.
		    YOu can also can't use reserved keywords of java in variable name.
		    
		 * Examples : */
		
		String name = "John";  
		System.out.println(name);  //Printing Variables
		
		int age = 20; // int 4 byte. and long 2 x 10^18 .
		System.out.println(age);
		
		// Declaring Multiple variables :
		
		long bigNumber = 93623692362969l;
		
		float averageMarks = 17.867f;
		
		char grade = 'A';
		
		boolean isValid = false;
		//In above line : boolean is Variable and isValid is a Identifiers .
		
		/* All Java variables must be identified with unique names.
		These unique names are called identifiers. */
		
		// To store data 
		
		int a = 8; // This takes value as 5 and store it in "a" .
		// int is a keyword and it stores integers.
		System.out.println(a);
				
				
		// To store a name (A bunch of character variable.) we use string .
		String name2 = "Ayush B Mishra" ;
		System.out.println(name2.toUpperCase());
		
		
		
	}

}
