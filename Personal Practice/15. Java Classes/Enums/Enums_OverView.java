package Enums;

/*
 An "Enums" is a special "class" that represents a group of constants (unchangeable variables, like final variables).
 Enums in Java are a special data type that allow you to define a set of named constants, 
       representing a fixed set of values. 
       
 They provide a way to represent a group of related constants in a more structured and type-safe manner. 
 Enums are used to improve code readability, maintainability, 
       and to avoid errors that can arise from using magic numbers or strings in your code.  
       
            
 To create an enum, use the enum keyword (instead of class or interface), and separate the constants with a comma. 
 Note that they should be in uppercase letters:           
 */


//Define an enum for days of the week
enum DayOfWeek {
 SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
	// These are the enum constants of the DayOfWeek enum.
}


public class Enums_OverView {
    public static void main(String[] args) {
        // Using enum constants
        DayOfWeek today = DayOfWeek.MONDAY;
        System.out.println("Today is " + today);

        // Switch statement with enums
        switch (today) {
            case SUNDAY:
                System.out.println("It's a holiday!");
                break;
            case SATURDAY:
                System.out.println("It's the weekend!");
                break;
            default:
                System.out.println("It's a regular working day.");
        }

        // Iterating over enum values
        for (DayOfWeek day : DayOfWeek.values())
        // This returns an array containing all the enum constants of the 
        	{
            System.out.println(day);
        }
    }
    
    /* we define an enum for the days of the week, 
          and then use it to represent the current day (today). 
       We use a switch statement to check the value of today and perform different actions based on the day. */
    
}



/* Advantages of Enums:
 
 * Type Safety: Enums provide type safety, which means that you can only assign values 
          that are part of the enum type. This helps catch errors during compilation rather than runtime.
 
 * Readability: Enum constants have meaningful names, making the code more self-explanatory and easier to understand.
 
 * Maintainability: If you need to add more constants in the future, you can simply 
          add them to the enum definition without changing the existing code that uses the enum.
          
 * Easy to Use: Enums can be used in switch statements, loops, and other control structures, 
          making the code more expressive and concise.
          
 * Singleton Pattern: Enums can also be used to implement the singleton pattern in Java.
 
 
 Disadvantages of Enums:
 * Limited Flexibility: Enum constants are fixed at compile-time and cannot be modified at runtime, 
          which might be a limitation in some scenarios.
 * Cannot Inherit: Enums cannot be extended by other classes, which means you cannot have subclasses 
          or implement interfaces.

*/
