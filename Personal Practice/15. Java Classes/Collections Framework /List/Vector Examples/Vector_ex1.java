package Collection_Framework;

import java.util.Vector;

public class Vector_ex1{
    public static void main(String[] args) {
        // Create a Vector to store integers
        Vector<Integer> numbers = new Vector<>();

        // Adding elements to the Vector
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Accessing elements using index
        System.out.println("First element: " + numbers.get(0)); // Output: First element: 10

        // Iterating through the Vector
        System.out.print("Vector elements: ");
        for (int num : numbers) {
            System.out.print(num + " "); // Output: Vector elements: 10 20 30
        }

        // Removing an element from the Vector
        numbers.remove(1); // Removes the element at index 1 (value 20)

        // Updated size and elements in the Vector after removal
        System.out.println("\nUpdated Size of the Vector: " + numbers.size()); // Output: Updated Size of the Vector: 2
        System.out.println("Updated Elements in the Vector: " + numbers); // Output: Updated Elements in the Vector: [10, 30]
    }
}

/*
      Common operations with Vector, 
      such as adding elements, accessing elements, iterating through the vector, and removing elements. 
      The main difference between Vector and ArrayList is the thread-safety feature of Vector, 
          making it suitable for concurrent access from multiple threads. 
      If thread safety is not a requirement, ArrayList is generally preferred for better performance 
          in single-threaded scenarios.
 */
