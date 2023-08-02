package Collection_Framework;

public class ArrayList_OverView {

	public static void main(String[] args) {
		/*
		 ArrayList, which is one of the most commonly used classes in the Java Collections Framework. 
		 An ArrayList is a dynamic and resizable array-based implementation of the List interface. 
		 
		 It provides a flexible way to work with collections of objects in Java. 
		  */

// -------------------------------------------------------------------------------------------------------------
				
		
		/* 
		 > Declaration and Initialization :
		 You can create an ArrayList by importing java.util.ArrayList and initializing it using the new keyword. 
		 The syntax for creating an ArrayList is as follows: 
		 (
		 import java.util.ArrayList;
		 
		 ArrayList<DataType> listName = new ArrayList<>();
		 )
		 Replace DataType with the data type of elements you want to store in the list. 
		 For example, ArrayList<Integer> stores integers, ArrayList<String> stores strings, and so on.
		 */

// -------------------------------------------------------------------------------------------------------------
						
		
		/*
		 Some more important things about ArrayList :
		 
		 > Dynamic Resizing:
		 Unlike arrays in Java, ArrayList can grow or shrink dynamically as elements are added or removed. 
		 It automatically resizes its internal array to accommodate new elements. 
		 This makes it more flexible than fixed-size arrays.

		 > Ordered Collection:
		 ArrayList maintains the order of elements based on their insertion. 
		 When you iterate through an ArrayList, elements are retrieved in the same order as they were added.

		 > Duplicate Elements:
		 ArrayList allows duplicate elements. You can have multiple occurrences of the same element in the list.

		 > Common Methods:
		 ArrayList provides a rich set of methods to manipulate and access elements. 
		 Some commonly used methods include:

		 add(E element): Adds an element to the end of the list.
		 add(int index, E element): Inserts an element at the specified index.
		 get(int index): Retrieves the element at the specified index.
		 remove(int index): Removes the element at the specified index.
		 size(): Returns the number of elements in the list.
		 isEmpty(): Checks if the list is empty.
		 contains(Object element): Checks if the list contains the specified element.
		 Iterating through ArrayList:
		 
		 You can use various looping mechanisms to iterate through an ArrayList, 
		 such as for loop, while loop, or for-each loop.

		 > Performance:
		 ArrayList provides fast access to elements by index, making it efficient for random access. 
		 However, adding or removing elements in the middle of the list can be less efficient 
		 due to the need for shifting elements.

		 > Thread-Safety:
		 ArrayList is not synchronized by default, which means it is not thread-safe for concurrent access. 
		 If you need a thread-safe version of ArrayList, 
		 you can use Collections.synchronizedList(new ArrayList<>()) to create one.

		 > Capacity Management:
		 ArrayList has a capacity, which is the size of the internal array used to store elements. 
		 If the number of elements exceeds the current capacity, 
		 ArrayList automatically increases its capacity to accommodate more elements.

		 > Performance Trade-offs:
		 While ArrayList provides fast access by index, it may not be the best choice for frequent insertions 
		 and deletions in the middle of the list. If you need frequent insertions 
		 and deletions, consider using LinkedList.

// -------------------------------------------------------------------------------------------------------------
		

		 ArrayList is widely used for general-purpose collections and is a go-to choice when you need a dynamic 
		 and resizable array-like data structure in Java. 
		 Keep in mind its performance characteristics 
		 and choose it wisely based on the requirements of your application.
		 
		 */

	}

}
