package Collection_Framework;

public class Queue {
	
	/*
	 Queue is an interface in Java that represents a collection designed to hold elements in a specific order. 
	 The elements are typically processed in a "first-in, first-out" (FIFO) manner, 
	 meaning the element that was added first will be removed first. 
	 In other words, the element that has been in the queue the longest is the first one to be processed.


	 The Queue interface extends the java.util.Collection interface 
	 and adds specific methods for adding, removing, and inspecting elements. 
	 
	 // import java.util.Queue;

// -------------------------------------------------------------------------------------------------------------
			 
	 
	 Some of the important methods in the Queue interface are:

	 boolean add(E element): 
	 Adds an element to the back (end) of the queue. 
	 If the queue is full, it throws an exception.

	 boolean offer(E element): 
	 Adds an element to the back of the queue. 
	 Returns true if the operation is successful; otherwise, returns false if the queue is full.

	 E remove(): 
	 Removes and returns the element at the front of the queue. 
	 Throws an exception if the queue is empty.

	 E poll(): 
	 Removes and returns the element at the front of the queue. 
	 Returns null if the queue is empty.

	 E element(): 
	 Retrieves, but does not remove, the element at the front of the queue. 
	 Throws an exception if the queue is empty.

	 E peek(): 
	 Retrieves, but does not remove, the element at the front of the queue. 
	 Returns null if the queue is empty. */

// -------------------------------------------------------------------------------------------------------------
			
	
	/*
	 Queues are commonly used in scenarios where you need to process elements in the order they were added, 
	 such as task scheduling, breadth-first search algorithms, and more.*/
	
	
	/*
	 Queue is an interface that represents a generic queue. 
	 It has multiple implementations, including PriorityQueue and Deque (Double-ended Queue). 
	 And, Deque is an interface that extends the Queue interface. 
	 One of the implementations of Deque is ArrayDeque.

	 The hierarchy can be summarized as follows:

	 Queue: The base interface representing a generic queue. 
	 It defines the basic operations common to all queues.
	 Sub-interface: Deque
	  
	 PriorityQueue: An implementation of the Queue interface that orders elements based on 
	 their natural order (or a custom comparator). 
	 Elements with higher priority are processed first.

	 Deque (Double-ended Queue): An interface that extends the Queue interface. 
	 It represents a queue where elements can be added and removed from both ends (front and back).

	 Implementations: ArrayDeque
	 ArrayDeque: An implementation of the Deque interface that is backed by an array. 
	 It can be used as a double-ended queue and is more efficient than LinkedList for most operations.

// -------------------------------------------------------------------------------------------------------------
		
	 So, the relationship is as follows:

	 Queue contains PriorityQueue and Deque
	 Deque contains ArrayDeque
	 

// -------------------------------------------------------------------------------------------------------------
		
	 
	 Each of these implementations serves different use cases. 
	 PriorityQueue is suitable when you want to process elements based on their priority. 
	 ArrayDeque is more efficient than LinkedList for most queue and stack operations 
	           because of its array-based implementation, while still providing the flexibility 
	           of a double-ended queue.*/

}
