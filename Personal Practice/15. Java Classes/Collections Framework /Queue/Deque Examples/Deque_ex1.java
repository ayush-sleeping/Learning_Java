package Collection_Framework;

import java.util.Deque;
import java.util.ArrayDeque;

public class Deque_ex1 {
    public static void main(String[] args) {
        // Declaration and Initialization of a Deque
        Deque<String> deque = new ArrayDeque<>();

        // Adding elements to the front and back of the Deque
        deque.addFirst("Front Element 1");
        deque.addLast("Back Element 1");
        deque.offerFirst("Front Element 2");
        deque.offerLast("Back Element 2");

        // Retrieving and removing elements from the front and back
        String frontElement = deque.pollFirst();
        String backElement = deque.pollLast();

        // Peeking at elements (retrieving without removing)
        String firstElement = deque.peekFirst();
        String lastElement = deque.peekLast();

        // Printing the results
        System.out.println("Front Element: " + frontElement);
        System.out.println("Back Element: " + backElement);
        System.out.println("First Element (Peek): " + firstElement);
        System.out.println("Last Element (Peek): " + lastElement);

        // Adding more elements
        deque.add("New Element 1");
        deque.add("New Element 2");

        // Printing the updated Deque
        System.out.println("Updated Deque: " + deque);

        // Removing all elements from the Deque
        deque.clear();

        // Checking if the Deque is empty
        boolean isEmpty = deque.isEmpty();
        System.out.println("Is the Deque empty? " + isEmpty);
    }
}
