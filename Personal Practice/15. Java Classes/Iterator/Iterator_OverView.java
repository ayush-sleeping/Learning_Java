	
	/*
	   Iterator Overview:
	      An iterator is an interface provided by the Java Collections Framework that allows you to traverse 
	      through a collection of elements, such as lists, sets, and maps, and access each element sequentially. 
	      It provides a uniform way to access elements without exposing the underlying data structure 
	      or implementation details.
	      
// ------------------------------------------------------------------------------------------------------------------

	   Why Use Iterator:
	      Safe Iteration: Using an iterator ensures safe traversal and modification of collections, 
	      even when elements are added or removed during iteration. 
	      It avoids issues like ConcurrentModificationException.

	      Consistent Interface: The iterator provides a consistent and standard way to access elements 
	      across different collection types.

	      Hidden Implementation: It abstracts the underlying data structure, 
	      allowing you to focus on accessing elements without worrying about the details of the 
	      collection's internal structure.
	      
// ------------------------------------------------------------------------------------------------------------------


	   How to Use Iterator:

	   Obtaining an Iterator:
	       Iterator<String> iterator = collection.iterator();
	       
	   Traversing Elements:
	       while (iterator.hasNext()) {
   	         String element = iterator.next();
  	            // Process the element
	       }

	   Removing Elements (Optional):
	      iterator.remove();
	      
// ------------------------------------------------------------------------------------------------------------------

	   
	   
	   Optimal Use:
	      Use an iterator when you need to traverse and access elements of a collection, 
	      especially when you want to safely remove elements during iteration.

	      Iterators are particularly useful when you want to hide the details of the collection's 
	      implementation while still providing a way to access its elements.
	      
// ------------------------------------------------------------------------------------------------------------------


	   Advantages:
	      Safe Iteration: Iterators handle concurrent modifications safely, preventing issues like 
	      ConcurrentModificationException.

	      Uniform Interface: Provides a consistent and uniform way to iterate through different types of collections.

	      Abstraction: Hides the internal structure of the collection, promoting encapsulation and modular design.
	      
// ------------------------------------------------------------------------------------------------------------------

	 Summary:
          Iterators provide a standardized and safe way to traverse through collections in Java. 
          They abstract the underlying data structure, ensuring consistent iteration and enabling safe modifications. 
          Use iterators when you need to access and process elements of a collection 
          without exposing its implementation details.
          
          
          */


package Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// we are using the Iterator to traverse through a list of names and print each name. 
public class Iterator_OverView {
    public static void main(String[] args) {
        // Create a list of names
        List<String> names = new ArrayList<>();
        names.add("Ayush");
        names.add("Sanket");
        names.add("Shivam");

        // Obtain an iterator
        Iterator<String> iterator = names.iterator();

        // Traverse and print elements
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
        
        // Each name is printed on a separate line, demonstrating how the iterator efficiently traverses 
        //    - through the list and retrieves each element for processing.
    }
}

/*
  Iterators are indeed used to loop through collections, and the term "iterating" 
  refers to the process of looping over elements. Importing the Iterator class from the java.util package 
  is necessary to utilize iterators effectively.  */






