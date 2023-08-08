package Collection_Framework;

	/*
	 TreeSet is a class in the Java Collections Framework that implements the SortedSet interface. 
	 It is used to store a sorted set of elements where the elements are automatically 
	 sorted in natural order or according to a specified comparator.

// --------------------------------------------------------------------------------------------------

	 Why Use TreeSet:
	     Automatic Sorting: TreeSet automatically maintains the elements in sorted order. 
	     This is useful when you need a collection with elements sorted according to their natural order 
	     (e.g., numbers, strings) or a custom sorting order.

	     Fast Retrieval: TreeSet provides fast retrieval of elements due to its underlying Red-Black 
	     Tree data structure. It ensures efficient search, insertion, and deletion operations.

	     Navigable Set Operations: TreeSet provides methods for navigable set operations 
	     such as finding elements less than or greater than a given element. This is helpful for range queries.

// --------------------------------------------------------------------------------------------------

	     Here's how you can use TreeSet:
	     Declaration and Initialization:


	     TreeSet<Integer> numbers = new TreeSet<>();
	  

// --------------------------------------------------------------------------------------------------

	     
	     
	 Optimal Use:
	     Use TreeSet when you need to maintain a sorted collection of elements that provides efficient search, 
	     insertion, and range queries.

	     TreeSet is especially useful when you need to keep elements sorted while efficiently 
	     handling navigable set operations.


// --------------------------------------------------------------------------------------------------



	  Advantages:
	     Sorted Order: Elements are automatically stored in sorted order, 
	     making it easy to retrieve them in a specific order.

	     Efficient Operations: TreeSet provides efficient operations for insertion, deletion, and searching.

	     Navigable Set: It offers methods for navigable set operations, 
	     making it suitable for tasks involving ranges of values.	 */

//--------------------------------------------------------------------------------------------------



	import java.util.TreeSet;

	public class TreeSet_OverView {
	    public static void main(String[] args) {
	        // Declaration and Initialization of a TreeSet
	        TreeSet<String> words = new TreeSet<>();

	        // Adding words to the TreeSet
	        words.add("apple");
	        words.add("grape");
	        words.add("orange");
	        words.add("banana");

	        // Printing the words in sorted order
	        for (String word : words) {
	            System.out.println(word);
	        }
	    }
	}

// --------------------------------------------------------------------------------------------------


/* Summary:
            TreeSet is an implementation of SortedSet that provides automatic sorting of elements 
            and efficient operations for search and range queries. 
            It's suitable for scenarios where maintaining a sorted order and performing navigable 
            set operations are important. Use TreeSet when you need a dynamically sorted collection 
            of elements that supports fast retrieval and navigation. */

