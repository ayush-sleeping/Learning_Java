package Collection_Framework;

import java.util.LinkedList;

public class LinkedLIst_ex2 {
    public static void main(String[] args) {
        // Create a LinkedList to store integers
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Print the original LinkedList
        System.out.println("Original LinkedList: " + numbers); 
        // Output: Original LinkedList: [10, 20, 30, 40]

        // Reverse the LinkedList
        reverseLinkedList(numbers);

        // Print the reversed LinkedList
        System.out.println("Reversed LinkedList: " + numbers); 
        // Output: Reversed LinkedList: [40, 30, 20, 10]
    }

    // Method to reverse a LinkedList
    public static void reverseLinkedList(LinkedList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // Swap elements at left and right indices
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }
}
