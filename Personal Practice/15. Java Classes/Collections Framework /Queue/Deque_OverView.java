package Collection_Framework;

public class Deque_OverView {

	/*
	 Deque (Double-ended Queue) is an interface in Java that represents a linear collection that supports 
	 the insertion and removal of elements at both ends (front and back). 
	 It provides a versatile way of managing elements with operations similar to both queues and stacks. 
	 Deque is pronounced as "deck."


	 */
	
	
	/*
	 The Deque interface extends the Queue interface and adds methods to manipulate elements at both ends.*/
//-------------------------------------------------------------------------------------------------------------
	

		/*
		 The Deque interface is implemented by two main classes in the Java Collections Framework:
		 
		 
		 LinkedList: A doubly-linked list that implements both the List and Deque interfaces. 
		 It provides efficient insertion and removal at both ends and can also be used as a regular list.

		 ArrayDeque: An array-based implementation of the Deque interface. 
		 It is more efficient than LinkedList for most operations and can be used as both a queue and a stack. */


//-------------------------------------------------------------------------------------------------------------
			
	
	/* 
	 > Declaration and Initialization :
	 You can create a Priority Queue by importing import java.util.PriorityQueue; .
	 The syntax for creating a Priority Queue is as follows:
	 (
	 
	 import java.util.Deque;

    // Declaration and Initialization of a Deque
        Deque<String> deque = new ArrayDeque<>();
       
	 )
	 */

//-------------------------------------------------------------------------------------------------------------
			
	/*
	 Some of the key methods in the Deque interface include:

	 void addFirst(E element): Inserts an element at the front of the deque.

	 void addLast(E element): Inserts an element at the back of the deque.

	 boolean offerFirst(E element): Inserts an element at the front of the deque, returning true if successful.

	 boolean offerLast(E element): Inserts an element at the back of the deque, returning true if successful.

	 E removeFirst(): Removes and returns the element at the front of the deque, 
	 throwing an exception if the deque is empty.

	 E removeLast(): Removes and returns the element at the back of the deque, 
	 throwing an exception if the deque is empty.

	 E pollFirst(): Removes and returns the element at the front of the deque, 
	 or returns null if the deque is empty.

	 E pollLast(): Removes and returns the element at the back of the deque, 
	 or returns null if the deque is empty.

	 E getFirst(): Retrieves the element at the front of the deque without removing it, 
	 throwing an exception if the deque is empty.

	 E getLast(): Retrieves the element at the back of the deque without removing it, 
	 throwing an exception if the deque is empty.

	 E peekFirst(): Retrieves the element at the front of the deque without removing it, 
	 or returns null if the deque is empty.

	 E peekLast(): Retrieves the element at the back of the deque without removing it, 
	 or returns null if the deque is empty.
	 */


//-------------------------------------------------------------------------------------------------------------
			
/*
	 Advantages of Deque:
	 Versatility: Deque combines the features of both queues and stacks, making it versatile for various use cases.

	 Efficient Insertions and Removals: Deque allows efficient insertion and removal of elements at both ends,
	  making it suitable for scenarios requiring frequent element manipulation.

	 Tail and Head Access: Deque provides direct access to both the head (front) and tail (back) elements.

	 Implementations: You can choose between LinkedList and ArrayDeque based on your performance 
	 and usage requirements.



   Common Use Cases for Deque:

	 Sliding Window Problems: Deque is used in algorithms that require sliding window techniques, 
	 like finding maximum/minimum values in a moving window.

	 Implementing Stacks and Queues: Deque can be used to implement stacks and queues 
	 due to its flexibility and efficient insertion/removal at both ends.

	 Graph Algorithms: Deque can be used in graph traversal algorithms like Breadth-First Search (BFS).

	 History Management: Deque can be used to implement a history management system where you can go back 
	 and forth between different states.

	 Task Scheduling: Deque can be used for task scheduling where tasks can be added and processed from both ends.

	 In summary, Deque is a powerful interface in Java's Collection Framework 
	 that provides efficient insertion and removal of elements at both ends, 
	 making it suitable for various scenarios where element manipulation is a key requirement. 
	 It combines the features of queues and stacks and is implemented by LinkedList and ArrayDeque classes.
	 
	 
	 */

	
}
