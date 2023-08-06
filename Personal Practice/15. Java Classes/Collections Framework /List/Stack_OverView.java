package Collection_Framework;

public class Stack_OverView {

	public static void main(String[] args) {

		/*
		 Stack, which is another implementation of the List interface in the Java Collections Framework. 
		 A Stack is a data structure that follows the Last-In-First-Out (LIFO) principle, 
		 where the last element added to the stack is the first one to be removed. 
		 */

//-------------------------------------------------------------------------------------------------------------
				
		
		/* 
		 > Declaration and Initialization :
		 You can create a Stack by importing java.util.Stack and initializing it using the new keyword. 
		 The syntax for creating a Stack is as follows:
		 (
		 import java.util.Stack;

         Stack<DataType> stackName = new Stack<>();


		 )
		Replace DataType with the data type of elements you want to store in the stack. 
		For example, Stack<Integer> stores integers, Stack<String> stores strings, and so on.
		 */

//-------------------------------------------------------------------------------------------------------------
						
		
		/*
		 Some more important things about ArrayList :
		 
		 > LIFO Data Structure:
		 Stack follows the Last-In-First-Out (LIFO) principle. 
		 This means that the last element added to the stack will be the first one to be removed. 
		 Think of it like a stack of plates; you add plates on top of each other and remove the topmost plate first.

		 > Common Methods:
		Stack provides methods specific to stack operations, 
		such as push(E element) to add an element to the top of the stack, pop() to remove 
		and retrieve the topmost element from the stack, peek() to retrieve the topmost element without removing it,
		 isEmpty() to check if the stack is empty, and size() to get the number of elements in the stack.
		 
		 > Inheritance:
		Stack is a subclass of Vector. As a result, it inherits all the methods from Vector 
		and has additional methods specific to stack operations.

		 > Usage Considerations:
		Use Stack when you need to maintain data in a Last-In-First-Out (LIFO) order, 
		such as performing undo operations or evaluating expressions.
        Note that due to its inheritance from Vector, Stack is synchronized, 
        making it thread-safe for concurrent access. 
        However, if thread safety is not a requirement, 
        consider using other stack implementations like Deque and LinkedList for better performance.


//-------------------------------------------------------------------------------------------------------------
		

		 
		Stack is a legacy class, and in modern Java code, 
		you may find that Deque and LinkedList are often preferred for stack-related operations 
		due to their improved performance and more versatile features.

        Keep in mind that if you only need a simple stack data structure, 
        Deque is a better choice. However, if you specifically require the Stack class, you can still use it, 
        especially if you need thread safety or if you want to take advantage of the methods inherited from Vector.
		 */

	}

}
