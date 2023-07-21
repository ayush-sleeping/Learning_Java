
public class Shape {
    // Method overloading: calculateArea 
    public double calculateArea(int sideLength) {
        // Calculate area of a square
        return sideLength * sideLength;
    }

    // Method overloading: calculateArea 
    public double calculateArea(int length, int width) {
        // Calculate area of a rectangle
        return length * width;
    }

    // Method overloading: calculateArea 
    public double calculateArea(double radius) {
        // Calculate area of a circle
        return Math.PI * radius * radius;
    }

    // Method overloading: calculateArea 
    public double calculateArea(int base, int height, boolean isTriangle) {
        // Calculate area of a triangle
        return 0.5 * base * height;
    }
    
    // Method overloading: calculateArea 
    public double calculateArea(double baseLength, double height) {
    	// Calculate area of a Parallelogram
        return baseLength * height;
    }
}

