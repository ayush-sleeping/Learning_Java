package Collection_Framework;

import java.util.ArrayList;

public class ArrayLIst_ex2 {
    public static void main(String[] args) {
        // Create an ArrayList to store integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(5);
        numbers.add(30);
        numbers.add(15);

        // Find the maximum element in the ArrayList
        int max = findMax(numbers);

        System.out.println("Maximum element in the ArrayList: " + max); 
        // Output: Maximum element in the ArrayList: 30
    }

    // Method to find the maximum element in an ArrayList
    public static int findMax(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;

        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    /*
     The max variable is initialized with the minimum possible integer value (Integer.MIN_VALUE) 
     so that any element in the list will be greater than this initial value. 
     We then compare each element with the current max value, and if an element is greater, 
     we update max to that element. 
     Finally, the findMax() method returns the maximum element found in the ArrayList. */
}
