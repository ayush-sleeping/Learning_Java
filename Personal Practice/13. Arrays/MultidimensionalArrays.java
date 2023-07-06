
public class MultidimensionalArrays {
	
	/* A multidimensional array in Java is an array of arrays, 
	 * where each element can also be an array.
	 * It allows you to store data in multiple dimensions, such as rows and columns.
	 ( Multidimensional arrays are useful when you want to store data as a tabular form, 
	   like a table with rows and columns.  ) 
	 */


    public static void main(String[] args) {
    	// 2D array matrix representing a 3x3 matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Loop through the 2D array 
        // ( nested for loops to iterate over the rows and columns of the array. )
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) 
            // print each element and add a new line after each row is printed.
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/* Arrays in Java provide a convenient way to store and manipulate collections of data. 
 * They allow efficient access to elements using indexes and can be iterated over using loops. 
 * Multidimensional arrays extend this capability to store data in multiple dimensions, 
 * such as rows and columns.
 */
