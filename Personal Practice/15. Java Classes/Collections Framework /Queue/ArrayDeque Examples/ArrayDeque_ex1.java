package Collection_Framework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeque_ex1 {
    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3; // Size of the sliding window

        // ArrayDeque to store indices of elements in the sliding window
        Deque<Integer> deque = new ArrayDeque<>();
        
        for (int i = 0; i < nums.length; i++) {
            // Remove indices that are out of the current window
            while (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }
            
            // Remove indices of smaller elements as they are no longer useful
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }
            
            // Add the current index to the deque
            deque.offerLast(i);
            
            // Print the maximum element in the current window
            if (i >= k - 1) {
                System.out.print(nums[deque.peekFirst()] + " ");
            }
        }
    }
    
    /*
     We use ArrayDeque to efficiently maintain the indices of elements within the sliding window. 
     The deque stores indices in decreasing order of element values, 
     allowing us to quickly find the maximum element in each window. 
     This approach provides an efficient solution to the sliding window maximum problem.*/
}





