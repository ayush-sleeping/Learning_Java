package Collection_Framework;

// We'll use a LinkedHashSet to maintain the order of unique elements as they are inserted.
// Maintaining Insertion Order ::


import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_ex1 {
    public static void main(String[] args) {
        // Declaration and Initialization of a LinkedHashSet
        Set<String> visitedCities = new LinkedHashSet<>();

        // Adding visited cities in order
        visitedCities.add("New York");
        visitedCities.add("London");
        visitedCities.add("Paris");
        visitedCities.add("Tokyo");

        // Visiting London again (no effect due to uniqueness)
        visitedCities.add("London");

        // Printing the visited cities in order of insertion
        System.out.println("Visited Cities: " + visitedCities);
    }
}

/*  In this scenario,
    we want to maintain the order of cities as they are visited. 
    A LinkedHashSet is a suitable choice because it preserves the order of insertion. 
    
    Even if a city is visited multiple times, only the first occurrence is retained due to 
    the set's uniqueness property. */
