package Collection_Framework;

/*
 Unique and Sorted Elements ::
        In this example, we'll use a TreeSet to store a collection of unique and sorted integers.
*/

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_ex3 {
    public static void main(String[] args) {
        // Declaration and Initialization of a SortedSet
        SortedSet<Integer> uniqueNumbers = new TreeSet<>();

        // Adding unique numbers to the SortedSet
        uniqueNumbers.add(50);
        uniqueNumbers.add(30);
        uniqueNumbers.add(70);
        uniqueNumbers.add(20);

        // Printing the unique numbers in sorted order
        System.out.println("Unique Numbers: " + uniqueNumbers);
    }
}

/*  In this case, we want to store a collection of unique integers in sorted order. 
 *      A TreeSet is an ideal choice because it enforces uniqueness and automatically maintains 
 *      the elements in sorted order. */

/* In summary, 
              SortedSet is a versatile interface in Java's Collection Framework that allows 
              you to maintain and access elements in a sorted order. 
              It's valuable when you need to efficiently retrieve elements in a specific order, 
              maintain uniqueness, or perform operations on subsets of elements based on their order.
 */
