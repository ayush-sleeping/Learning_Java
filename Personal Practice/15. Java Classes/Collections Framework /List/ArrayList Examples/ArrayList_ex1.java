package Collection_Framework;

import java.util.ArrayList;

public class ArrayList_ex1 {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Accessing elements using index
        System.out.println("First element: " + numbers.get(0)); // Output: First element: 10

        // Iterating through the ArrayList
        System.out.print("ArrayList elements: ");
        for (int num : numbers) {
            System.out.print(num + " "); // Output: ArrayList elements: 10 20 30
        }

        // Removing an element from the ArrayList
        numbers.remove(1); // Removes the element at index 1 (value 20)

        // Updated size and elements in the ArrayList after removal
        System.out.println("\nUpdated Size of the ArrayList: " + numbers.size()); 
        // Output: Updated Size of the ArrayList: 2
        System.out.println("Updated Elements in the ArrayList: " + numbers); 
        // Output: Updated Elements in the ArrayList: [10, 30]
    }
}
