package Interface;

/* Another way to achieve abstraction in Java, is with interfaces.
   An interface is a completely "abstract class" that is used to group related methods with empty bodies. 

   
   An interface is a reference type that acts as a blueprint for classes. 
   It defines a set of methods that a class must implement if it implements that interface. 
   An interface can contain method signatures, default methods 
      (introduced in Java 8), constant fields (which are implicitly public, static, and final), 
      and nested types (like inner classes and other interfaces).
      
   To access the interface methods, 
   the interface must be "implemented" (kinda like inherited) by another class 
       with the implements keyword (instead of extends). 
   The body of the interface method is provided by the "implement" class.
    
*/
interface Shape {
    // Method signatures
    double getArea();
    double getPerimeter();
}

//Circle Interface_Overview implementing the Shape interface
public class Interface_Overview implements Shape {
    private double radius;

    public Interface_Overview/*Circle*/(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

// NOW checkout the main file, where I am  Creating a Circle object and calling its methods.






