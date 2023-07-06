

public class Strings {
	public static void main(String[] args) {
		
		/* 
		 * Java Strings :
		 * Strings are used for storing text.
		 * Java Strings are objects used to represent sequences of characters.
		 * Strings are immutable, meaning they cannot be changed once created.
		 * Strings in Java are represented by the String class.
		 */
		
		// String declaration and assignment :
		// We declare and assign a string variable message with the value "Hello, Java!".
        String message = "Hello, Java!";

        
        // String length :
        /* We use the length() method to get the length of the string 
         * and store it in the length variable. */
        int length = message.length();
        System.out.println("Length: " + length); // Output: Length: 13

        
        // Accessing characters in a string :
        /* We use the charAt() method to access the character at index 0 
         * in the message string and store it in the firstChar variable. */
        char firstChar = message.charAt(0);
        System.out.println("First character: " + firstChar); // Output: First character: H

        
        // Concatenating strings :
        /* We concatenate two strings using the + operator 
         * to create a new string fullName containing the full name. */
        String greeting = "Welcome";
        String fullName = greeting + " to Java";
        System.out.println("Full name: " + fullName); // Output: Full name: Welcome to Java
    }
}
