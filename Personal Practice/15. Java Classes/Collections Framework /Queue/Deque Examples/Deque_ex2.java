package Collection_Framework;

import java.util.Deque;
import java.util.LinkedList;

public class Deque_ex2 {
    public static void main(String[] args) {
        // Declaration and Initialization of a Deque using LinkedList
        Deque<Integer> deque = new LinkedList<>();

        // Adding elements to the front and back of the Deque
        deque.addFirst(10);
        deque.addLast(20);
        deque.offerFirst(5);
        deque.offerLast(30);

        // Retrieving and removing elements from the front and back
        int frontElement = deque.pollFirst();
        int backElement = deque.pollLast();

        // Peeking at elements (retrieving without removing)
        int firstElement = deque.peekFirst();
        int lastElement = deque.peekLast();

        // Printing the results
        System.out.println("Front Element: " + frontElement);
        System.out.println("Back Element: " + backElement);
        System.out.println("First Element (Peek): " + firstElement);
        System.out.println("Last Element (Peek): " + lastElement);

        // Adding more elements
        deque.add(15);
        deque.add(25);

        // Printing the updated Deque
        System.out.println("Updated Deque: " + deque);

        // Removing all elements from the Deque
        deque.clear();

        // Checking if the Deque is empty
        boolean isEmpty = deque.isEmpty();
        System.out.println("Is the Deque empty? " + isEmpty);
    }
    /*
     In this example, 
     we use LinkedList as the implementation of the Deque interface. 
     The operations and methods are similar to the previous example with ArrayDeque, 
     including adding elements to the front and back, retrieving and removing elements, 
     peeking at elements, printing results, adding more elements, clearing the deque, 
     and checking if it's empty.*/
}

/*
 The main difference is that the LinkedList class allows you to create a Deque 
 with a doubly-linked list underlying the structure. 
 This can be useful in scenarios where you need a dynamic data structure 
 that can efficiently manage elements at both ends.*/





