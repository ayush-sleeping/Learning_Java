
public class Arrays {
	
	/* An array in Java is a data structure that stores a fixed-size sequence
	   of elements of the same data type.
	 *  Arrays are used to store and manipulate collections of data in a compact and efficient manner.
	 *  Elements in an array are accessed using an index, starting from 0.
	 */


    public static void main(String[] args) {
        // Declaring and initializing an array
        int[] numbers = {5, 10, 15, 20, 25};

        // Accessing array elements using indexes
        System.out.println("First element: " + numbers[0]); 
        // Output: First element: 5
        System.out.println("Third element: " + numbers[2]); 
        // Output: Third element: 15

        // Modifying array elements
        numbers[1] = 12;
        System.out.println("Modified second element: " + numbers[1]); 
        // Output: Modified second element: 12

        // Finding the length of the array
        int length = numbers.length;
        System.out.println("Array length: " + length); 
        // Output: Array length: 5
    }
}
