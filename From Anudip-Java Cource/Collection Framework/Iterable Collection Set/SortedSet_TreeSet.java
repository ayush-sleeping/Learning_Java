
package Iterable_Collection_Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSet_TreeSet {
    public static void main(String[] args) {
        SortedSet<Integer> sortedSet = new TreeSet<>();
        // The TreeSet implementation automatically maintains the sorted order of elements.

        // Adding elements to the sorted set :
        sortedSet.add(20);
        sortedSet.add(10);
        sortedSet.add(30);
        sortedSet.add(15);

        // access the first and last elements of the sorted set :
        int firstElement = sortedSet.first();
        int lastElement = sortedSet.last();
        System.out.println("First element: " + firstElement); // Output: First element: 10
        System.out.println("Last element: " + lastElement); // Output: Last element: 30

        // Accessing elements within a range
        SortedSet<Integer> subset = sortedSet.subSet(15, 30);
        // (  includes elements greater than or equal to 15 and less than 30. )
        
        System.out.println("Subset elements:");
        for (int element : subset) {
            System.out.println(element);
        }

        // Displaying the sorted set elements
        // ( terate over the elements of the subset and the sorted set  )
        System.out.println("Sorted set elements:");
        for (int element : sortedSet) {
            System.out.println(element);
        }
    }
}