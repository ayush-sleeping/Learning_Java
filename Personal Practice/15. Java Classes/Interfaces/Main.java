package Interface;

public class Main {
    public static void main(String[] args) {
    	
    	 // Create a Circle object and call its methods
        Shape circle = new Interface_Overview(5.0);
        System.out.println("Circle Area: " + circle.getArea());
        System.out.println("Circle Perimeter: " + circle.getPerimeter());
}
}


/* Output :
   Circle Area: 78.53981633974483
   Circle Perimeter: 31.41592653589793
   
 */


/* By using the Shape interface, 
 * we achieve abstraction and decouple the client code (in the Main class) 
      from the implementation details of the Circle and Rectangle classes. 
      
 This makes the code more flexible, maintainable, and extensible. 
 If we later add more shape classes (e.g., Triangle, Square), 
      we can easily use them in the same way, as long as they implement the Shape interface.
      
       
 The interface acts as a contract that enforces certain behavior for implementing classes.
 
 */
