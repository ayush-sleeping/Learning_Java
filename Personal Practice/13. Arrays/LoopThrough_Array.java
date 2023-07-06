
public class LoopThrough_Array {
	
	/* You can loop through the array elements with the for loop, 
	 * and use the length property to specify how many times the loop should run.
	 
	  
	 * To iterate over the elements of an array, we can use loops 
	 * such as for, while, or enhanced for loop (for-each loop).
	 */


    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};

        // Loop through the array using a for loop
        for (int i = 0; i < numbers.length; i++) 
        //  loop starts from index 0 and continues until the index is less than the length of the array.
        {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
