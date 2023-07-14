
/* 
	 Here's a simple analogy to help understand the concept : 
	 * Classes are like "Fruits" and Objects are "Apple, Banana, Mango ..."
	 
	 A class in Java is a blueprint or template that defines the structure and behavior of objects.
	 * It encapsulates data (variables) and methods (functions) that operate on that data.
	 
	 An object, on the other hand, is an instance of a class. 
	 * It is a tangible entity that represents a specific instance of the class. 
	 * Objects have their own unique state (attribute values) and behavior (method implementations) 
	 * based on the class from which they are created.
	  
	  
	 A class defines the structure, properties, and behaviors of a car, 
	 * such as its color, brand, and the ability to drive. 
	 An object is a specific car, like a red Toyota, 
	 * that has its own unique characteristics based on the class.    */
	
	// Lets see one example :


package Classes_and_Objects;


class Fruit {
    String name;
    String color;

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
    }
}

/* Fruit class represents the blueprint for creating fruit objects. 
 * The class has two attributes: name and color, and a method displayInfo() to display information about the fruit.
 */

public class ClassesAndObjects_Overview {
	
	public static void main(String[] args) {
        // Creating objects of Fruit class
        Fruit apple = new Fruit();
        apple.name = "Apple";
        apple.color = "Red";

        Fruit banana = new Fruit();
        banana.name = "Banana";
        banana.color = "Yellow";

        // Displaying information about the fruits
        System.out.println("Information about Apple:");
        apple.displayInfo();

        System.out.println("Information about Banana:");
        banana.displayInfo();
    }
	
	/* In the main() method, we create two objects of the Fruit class: apple and banana. 
	 * We assign values to their attributes using dot notation (objectName.attributeName). 
	 * Then, we call the displayInfo() method on each object to print their information.
	 */

}
