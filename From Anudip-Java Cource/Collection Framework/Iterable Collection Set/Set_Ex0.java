package Iterable_Collection_Set;


/* Set is an interface, it can be used only with a class that implements this 
   using the Set interface and HashSet implementation, 
   
          we ensure that duplicate elements are not allowed in the collection.
          
 * set maintains a unique collection of elements, 
      and it provides methods to add, remove, check for containment, retrieve the size, and check if it is empty. 
 */

/* 
 Java HashSet Features
 A few important features of HashSet are mentioned below:

1. Implements Set Interface.
2. The underlying data structure for HashSet is Hashtable.
3. As it implements the Set Interface, duplicate values are not allowed.
4. Objects that you insert in HashSet are not guaranteed to be inserted in the same order. 
            Objects are inserted based on their hash code.
5. NULL elements are allowed in HashSet.
6. HashSet also implements Serializable and Cloneable interfaces.



hashCode() is used for bucketing in Hash implementations 
like HashMap , HashTable , HashSet , etc. 
The value received from hashCode() is used as the bucket number
 for storing elements of the set/map. This bucket number is the address of the element inside the set/map.

*/






//import java.util.*;

import java.util.Set;
import java.util.HashSet;

public class Set_Ex0 {

    public static void main(String[] args) {
    	
    	// Set Interface and HashSet
        Set<String> colors = new HashSet<>();
        colors.add("Red"); // Adding elements to the set
        colors.add("Blue");
        colors.add("Green");

        System.out.println("Size: " + colors.size()); // Getting the size of the set
        System.out.println("Contains 'Blue': " + colors.contains("Blue")); 
        // Checking if the set contains a specific element
        
        
        colors.remove("Red"); // Removing an element from the set
        System.out.println("Is empty: " + colors.isEmpty()); // Checking if the set is empty

        
        
    }

}

/* A Set is a generic set of values with no duplicate elements.". 
 * A TreeSet is a set where the elements are sorted (and thus ordered), 
 * a HashSet is a set where the elements are not sorted or ordered. 
 * A HashSet is typically a lot faster than a TreeSet .

 * Set is a parent interface of all set classes like TreeSet, HashSet, LinkedHashset.*/




