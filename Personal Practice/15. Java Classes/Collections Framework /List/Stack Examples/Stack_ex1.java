package Collection_Framework;

import java.util.Stack;

public class Stack_ex1 {
    public static void main(String[] args) {
        // Create a Stack to store integers
        Stack<Integer> numberStack = new Stack<>();

        // Push elements onto the Stack
        numberStack.push(10);
        numberStack.push(20);
        numberStack.push(30);

        // Display the Stack elements
        System.out.println("Stack elements: " + numberStack); 
        // Output: Stack elements: [10, 20, 30]

        
        // Pop an element from the top of the Stack
        int poppedElement = numberStack.pop();
        System.out.println("Popped element: " + poppedElement); 
        // Output: Popped element: 30

        
        // Display the updated Stack after popping
        System.out.println("Updated Stack elements: " + numberStack); 
        // Output: Updated Stack elements: [10, 20]

        
        // Peek the element at the top of the Stack without removing it
        int topElement = numberStack.peek();
        System.out.println("Top element: " + topElement); 
        // Output: Top element: 20

        
        // Check if the Stack is empty
        System.out.println("Is the Stack empty? " + numberStack.isEmpty()); 
        // Output: Is the Stack empty? false

        
        // Get the size of the Stack
        System.out.println("Size of the Stack: " + numberStack.size()); 
        // Output: Size of the Stack: 2
    }
    
    /*
     This example demonstrates common operations with Stack, such as pushing elements onto the stack, 
     popping elements from the top of the stack, peeking at the top element, checking if the stack is empty, 
     and getting the size of the stack.*/
}



