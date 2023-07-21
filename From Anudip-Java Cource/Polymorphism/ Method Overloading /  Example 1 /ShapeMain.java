import java.util.Scanner;

public class ShapeMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shape shape = new Shape();
        
       /* creating an instance of the Shape class and accessing the methods 
        * defined in the Shape class through the shape object .
        * */

        System.out.println("Select a shape to calculate its area:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Circle");
        System.out.println("4. Triangle");
        System.out.println("5. Parallogram");
        System.out.print("Enter your choice: ");
        int option = input.nextInt();
        
        /* This above line is used to read an integer input from the user 
         * and store it in the variable option.*/

        switch (option) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                int sideLength = input.nextInt();
                // Method overloading: calculateArea(int sideLength) is called
                double squareArea = shape.calculateArea(sideLength);
                System.out.println("Area of the square: " + squareArea);
                break;
                
                /* "Shape" -> allowing to invoke the "calculateArea" methods for different shapes based on user input,*/
                
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                int length = input.nextInt();
                System.out.print("Enter the width of the rectangle: ");
                int width = input.nextInt();
                // Method overloading: calculateArea(int length, int width) is called
                double rectangleArea = shape.calculateArea(length, width);
                System.out.println("Area of the rectangle: " + rectangleArea);
                break;
                
            case 3:
                System.out.print("Enter the radius of the circle: ");
                double radius = input.nextDouble();
                // Method overloading: calculateArea(double radius) is called
                double circleArea = shape.calculateArea(radius);
                System.out.println("Area of the circle: " + circleArea);
                break;
                
            case 4:
                System.out.print("Enter the base of the triangle: ");
                int base = input.nextInt();
                System.out.print("Enter the height of the triangle: ");
                int height = input.nextInt();
                // Method overloading: calculateArea(int base, int height) is called
                double triangleArea = shape.calculateArea(base, height);
                System.out.println("Area of the triangle: " + triangleArea);
                break;
                
            case 5:
                System.out.print("Enter the base length of the parallelogram: ");
                double baseLength = input.nextDouble();
                System.out.print("Enter the height of the parallelogram: ");
                double heightParallelogram = input.nextDouble();
             // Method overloading: calculateArea(int baseLength, int heightParallelogram) is called
                double parallelogramArea = shape.calculateArea(baseLength, heightParallelogram);
                System.out.println("Area of the parallelogram: " + parallelogramArea);
                break;
 
            default:
                System.out.println("Invalid choice!");
                break;
        }

        input.close();
    }
}
