package Collection_Framework;

import java.util.Vector;

public class Vector_ex2 {
    public static void main(String[] args) {
        // Create a Vector to store strings
        Vector<String> fruits = new Vector<>();

        // Adding elements to the Vector
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Checking if a specific fruit is present in the Vector
        String targetFruit = "Banana";
        if (fruits.contains(targetFruit)) {
            System.out.println(targetFruit + " is present in the Vector.");
        } else {
            System.out.println(targetFruit + " is not present in the Vector.");
        }

        // Removing a fruit from the Vector
        String removedFruit = "Orange";
        boolean removed = fruits.remove(removedFruit);
        if (removed) {
            System.out.println(removedFruit + " removed from the Vector.");
        } else {
            System.out.println(removedFruit + " not found in the Vector.");
        }

        // Displaying the updated Vector
        System.out.println("Updated Vector: " + fruits);
    }
}

/*
   Operations with Vector, 
   such as checking if a specific element is present in the Vector 
   using the contains() method and removing an element from the Vector using the remove() method. 
 */
