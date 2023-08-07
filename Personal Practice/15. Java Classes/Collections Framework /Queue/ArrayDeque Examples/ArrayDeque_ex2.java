package Collection_Framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque_ex2 {
    public static void main(String[] args) {
        // Using ArrayDeque as a stack
        Deque<Integer> stack = new ArrayDeque<>();
        
        stack.push(10); // Push an element onto the stack
        stack.push(20);
        stack.push(30);
        
        System.out.println("Top element: " + stack.peek()); // Peek at the top element
        
        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop()); // Pop elements from the stack
        }
    }
    
    /*
     We utilize ArrayDeque as a stack by using the push, pop, and peek methods. 
     ArrayDeque provides efficient insertion and removal at both ends, 
     making it well-suited for implementing a stack. */
}



