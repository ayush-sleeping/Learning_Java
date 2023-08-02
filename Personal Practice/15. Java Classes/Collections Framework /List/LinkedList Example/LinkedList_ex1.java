package Collection_Framework;

import java.util.LinkedList;

public class LinkedList_ex1 {
    public static void main(String[] args) {
        // Create a LinkedList to store strings
        LinkedList<String> names = new LinkedList<>();

        // Adding elements to the LinkedList
        names.add("Ayush");
        names.add("Shivam");
        names.add("Ashish");

        // Accessing elements using index
        System.out.println("First element: " + names.get(0)); 
        // Output: First element: Ayush

        // Iterating through the LinkedList
        System.out.print("LinkedList elements: ");
        for (String name : names) {
            System.out.print(name + " "); 
            // Output: LinkedList elements: Ayush Shivam Ashish
        }

        // Removing an element from the LinkedList
        names.remove(1); 
        // Removes the element at index 1 (value "Shivam")

        // Updated size and elements in the LinkedList after removal
        System.out.println("\nUpdated Size of the LinkedList: " + names.size()); 
        // Output: Updated Size of the LinkedList: 2
        System.out.println("Updated Elements in the LinkedList: " + names); 
        // Output: Updated Elements in the LinkedList: [Ayush, Ashish]
    }
}
