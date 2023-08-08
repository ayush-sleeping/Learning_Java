package Collection_Framework;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// In this example, we'll use a HashSet to efficiently remove duplicates from an ArrayList.

public class HashSet_ex1 {
    public static void main(String[] args) {
        // Creating an ArrayList with duplicates
        List<Integer> numbersWithDuplicates = new ArrayList<>();
        numbersWithDuplicates.add(5);
        numbersWithDuplicates.add(10);
        numbersWithDuplicates.add(5);
        numbersWithDuplicates.add(15);
        numbersWithDuplicates.add(10);

        // Using HashSet to remove duplicates
        Set<Integer> uniqueNumbers = new HashSet<>(numbersWithDuplicates);

        // Printing the unique numbers
        System.out.println("Unique Numbers: " + uniqueNumbers);
    }
}

/*
 In this scenario, 
 We have an ArrayList with duplicate elements. We want to efficiently remove the duplicates 
 and retain only the unique elements. Using a HashSet allows us to do this efficiently, 
 as it automatically enforces uniqueness. We create a HashSet and pass the ArrayList to its constructor. 
 The HashSet will automatically remove duplicates, and we get a collection of unique numbers.
 */
