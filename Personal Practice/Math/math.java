
public class math {
	/*
	 * Java provides the Math class : which contains various mathematical operations and functions.
	 * The Math class provides methods for performing common mathematical calculations, 
	 * such as square root, absolute value, rounding, trigonometric functions, etc.
	 */
	
    public static void main(String[] args) {
    	
        // Absolute value :
    	// The abs() method returns the absolute value of a number.
        int absoluteValue = Math.abs(-10);
        System.out.println("Absolute Value: " + absoluteValue); 
        // Output: Absolute Value: 10
        
        
        
        // Rounding :
        // The round() method rounds a floating-point number to the nearest whole number.
        double roundedValue = Math.round(3.7);
        System.out.println("Rounded Value: " + roundedValue); 
        // Output: Rounded Value: 4
        
        
        
        // Ceiling
        // The ceil() method returns the smallest integer greater than or equal to a number.
        double ceilingValue = Math.ceil(4.2);
        System.out.println("Ceiling Value: " + ceilingValue); 
        // Output: Ceiling Value: 5.0
        
        
        
        // Floor
        // The floor() method returns the largest integer less than or equal to a number.
        double floorValue = Math.floor(4.8);
        System.out.println("Floor Value: " + floorValue); 
        // Output: Floor Value: 4.0
        
        
        
        // Power
        // The pow() method calculates the power of a number.
        double powerResult = Math.pow(2, 3);
        System.out.println("Power Result: " + powerResult); 
        // Output: Power Result: 8.0
        
        
        
        // Trigonometric functions
        // The sin(), cos(), and tan() methods are trigonometric functions 
        // that calculate the sine, cosine, and tangent of an angle, respectively.
        double sinValue = Math.sin(Math.PI / 2);
        System.out.println("Sin Value: " + sinValue); // Output: Sin Value: 1.0
        
        double cosValue = Math.cos(Math.PI);
        System.out.println("Cos Value: " + cosValue); // Output: Cos Value: -1.0
        
        double tanValue = Math.tan(Math.PI / 4);
        System.out.println("Tan Value: " + tanValue); // Output: Tan Value: 1.0
    }
}
