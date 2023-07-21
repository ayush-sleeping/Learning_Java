package Iterable_Collection_Set;


/* using the Set interface and HashSet implementation, 
          we ensure that duplicate elements are not allowed in the collection.
 * set maintains a unique collection of elements, 
      and it provides methods to add, remove, check for containment, retrieve the size, and check if it is empty. 
 */


// import java.util.*;

import java.util.Set;
import java.util.HashSet;
// using the Set interface and its implementation class HashSet from the Java Collection framework

public class Set_Ex1 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet<>(); 
        // Here I am creating a HashSet object named "fruits" that stores String elements.

        
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange"); 
        fruits.add("Apple"); 
        /* (adding elements to the fruits set using the add() method) 
         * Adding duplicate element, it will be ignored */

        
        System.out.println(fruits); // Output: [Banana, Orange, Apple]
        System.out.println("Size: " + fruits.size()); // Output: 3 ( retrieve the size of the set using fruits.size() )
        System.out.println("Contains 'Banana': " + fruits.contains("Banana")); 
        // check if the set contains the element "Banana"  ( Output: true )

        
        fruits.remove("Orange"); // remove the element "Orange"
        System.out.println(fruits); // print the updated set  ( Output: [Banana, Apple] )
        System.out.println("Is empty: " + fruits.isEmpty()); // check if the set is empty ( Output: false )

        
        fruits.clear(); // clear the set
        System.out.println(fruits); // print the set after clearing it ( Output: [] )
        System.out.println("Is empty: " + fruits.isEmpty()); // check if the set is empty again ( Output: true )
    } 
}











