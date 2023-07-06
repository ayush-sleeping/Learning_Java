
import java.util.Arrays;

public class DataTypes {

	public static void main(String[] args) {
		// Let's understand DataTypes of Java : 
		
		/* 
		 * Data types in Java define the type and size of data that can be stored in variables. 
		 * They specify the range of values and operations that can be performed on the data. 
		 * */
		
		
		/*
		 * Data types are divided into two groups:
		 * Primitive data types - includes byte, short, int, long, float, double, boolean and char
		 * Non-primitive data types or Reference Data Types - such as String, Arrays and Classes 
		 */
		
		// Primitive data types :
		int age  = 25; // an integer variable to store age
		double height = 1.75; // a double variable to store height
		boolean isStudent = true; // a boolean variable to store a true/false value
		char grade = 'A'; // a character variable to store small whole numbers
		byte num = 100; // a byte variable to store small whole numbers
		short population = 30000; // a short variable to store small whole numbers
		long worldPopulation = 7800000000L; // a long variable to store large whole numbers
		float pi = 3.14f; // a float variable to store decimal numbers with less precision
		
		
		// Non-primitive data types or Reference Data Types :
        String name = "John Doe"; // a String object to store a sequence of characters
        int[] numbers = {1, 2, 3, 4, 5}; // an array of integers to store multiple values
        MyClass obj = new MyClass(); // an object of custom class MyClass

        // Printing the values :
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is Student: " + isStudent);
        System.out.println("Grade: " + grade);
        System.out.println("Number: " + num);
        System.out.println("Population: " + population);
        System.out.println("World Population: " + worldPopulation);
        System.out.println("Pi: " + pi);
        System.out.println("Name: " + name);
        System.out.println("Numbers: " + Arrays.toString(numbers));
        System.out.println("Object: " + obj);
    }
}

class MyClass {
    // Custom class
}
