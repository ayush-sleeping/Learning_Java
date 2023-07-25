package ThursdayLab_13JUly;

/*
  Q. Write a program to demonstrate the chained exception in Java.
 */


public class ChainedException {
	public static void main(String[] args) throws Exception {
	
	try {
	    // This code may throw an exception
	    int result = 10 / 0;
	} catch (ArithmeticException e) {
	    // This exception was caused by an attempt to divide by zero
	    throw new Exception("Error: Division by zero", e);
	}

}
}
