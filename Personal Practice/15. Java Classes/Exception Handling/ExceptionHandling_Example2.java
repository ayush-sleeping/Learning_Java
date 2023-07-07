package ExceptionHandling;

public class ExceptionHandling_Example2 {
    public static void main(String[] args) {
    	
    	
        try {
            String str = "abc213";
            int num = Integer.parseInt(str);
            System.out.println("Parsed number: " + num);
            
            /* convert a string (str) containing a numerical value to an integer 
                  using the Integer.parseInt() method. */
            
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
            
            /* if the string cannot be parsed as a valid integer, it will throw a NumberFormatException.
             
             * The program catches this exception using the catch block 
                   and prints an error message indicating that the number format is invalid.*/
        }
        
        
    }
}
