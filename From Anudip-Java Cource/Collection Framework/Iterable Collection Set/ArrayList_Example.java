package Iterable_Collection_Set;

import java.util.*;

public class ArrayList_Example {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Adding duplicate element ( Duplicates are allowed )

        System.out.println(fruits); // Output: [Apple, Banana, Orange, Apple] ( Order is maintained )
        System.out.println("Size: " + fruits.size()); // Output: 4
        System.out.println("Contains 'Banana': " + fruits.contains("Banana")); // Output: true

        fruits.remove("Orange");
        System.out.println(fruits); // Output: [Apple, Banana, Apple]
        System.out.println("Is empty: " + fruits.isEmpty()); // Output: false

        fruits.clear();
        System.out.println(fruits); // Output: []
        System.out.println("Is empty: " + fruits.isEmpty()); // Output: true
    }
}

/* Slower performance for large sets: ArrayList has a linear search time complexity of O(n) 
 * for operations like contains and remove, as it needs to iterate over the elements. 
 * On the other hand, HashSet provides faster access and removal 
 * with an average time complexity of O(1) (constant time),
 *  making it more efficient for larger sets.*/
