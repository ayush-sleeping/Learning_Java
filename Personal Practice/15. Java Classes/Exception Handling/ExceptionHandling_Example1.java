package ExceptionHandling;

public class ExceptionHandling_Example1 {
	   public static void main(String[] args) {
		   
		   
	        try {
	            int[] myNumbers = {1, 2, 3, 4, 5}; 
	            // Declare and initialize an array of integers
	            
	            System.out.println(myNumbers[10]); 
	            // Try to access an element at index 10, which is beyond the array length
	            
	        } catch (Exception e) {
	            System.out.println("Something went wrong."); 
	            // Catch and handle any exception that occurs
	        }
	        
	        
	        
	    }
	}
