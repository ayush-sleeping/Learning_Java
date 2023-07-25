package Collection_Framework;

/* 
 The Java Collection Framework is a set of classes and interfaces provided by Java to handle 
     and manipulate groups of objects, known as collections. 
 It is a fundamental part of the Java API and is extensively used in Java programming 
     for data manipulation and storage.
 
 The Collection Framework provides a unified architecture to work with different types of collections, 
     making it easier to manage and manipulate data in various ways. */


// Hierarchy of Collection framework : 
/*
                                      Iterable
                                         |
                                      Collection
                                         |
       ----------------------------------------------------------------------
       |                                 |                                  |
     List                              Queue                               Set
     |                                |    |- PriorityQueue               |    |
     |- ArrayList                     |                                   |    |- HashSet
     |                                |                                   |    |
     |- LinkedList                  Deque                                 |    |- LinkedHashSet
     |                                |                                   |
     |- Vector                        |- ArrayDeque                   SortedSet
     |                                                                    |
     |- Stack                                                             |- TreeSet       
     
    
  */

import java.util.ArrayList;  // ArrayList to store a list of integers. 
import java.util.List;

public class CollectionFramework_Overview  {
    public static void main(String[] args) {
    	
        // Create a list to store integers
        List<Integer> numbers = new ArrayList<>();

        
        // Add elements to the list
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        

        // Display the elements in the list
        System.out.println("Numbers in the list:");
        for (int number : numbers) {
            System.out.println(number);
        }
        
 // In this example, we use the List interface and the ArrayList class to create and manage a list of integers. 
    }
    
}



/*
 Some of the key features and benefits of the Collection Framework are as follows:
    
    Abstraction: The Collection Framework provides a set of abstract data types (interfaces) 
                 that define the behavior and operations of different types of collections. 
                 This abstraction allows programmers to work with collections without worrying about 
                 the underlying implementation details.

    Reusability: By using the Collection Framework, developers can reuse the standard collection 
                 interfaces and classes, avoiding the need to write custom data structures for different scenarios. This leads to more efficient and maintainable code.

    Flexibility: The Collection Framework provides a wide range of collection types, such as lists, 
                 sets, maps, and queues, each designed to cater to specific requirements. 
                 This allows developers to choose the appropriate collection type based on the 
                 needs of their application.

    Standardization: The Collection Framework follows a consistent and standard API design, 
                     making it easier for developers to learn and use different collection classes.

    Efficiency: The collection classes in the Collection Framework are designed to be efficient 
                and optimized for common operations like searching, insertion, deletion, and iteration.

    Support for Generics: Java's Generics feature is extensively used in the Collection Framework 
                          to ensure type safety and eliminate the need for explicit type casting.

    Enhanced Algorithms: The Collection Framework provides a set of powerful algorithms for sorting, 
          searching, and manipulating collections, which can be easily applied to different collection types.
 
 */
