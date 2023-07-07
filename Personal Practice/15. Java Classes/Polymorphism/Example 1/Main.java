package Polymorphism;

public class Main {
	  public static void main(String[] args) {
		    Shape shape1 = new Shape();  // Create a Shape object
		    Shape shape2 = new Circle();  // Create a Circle object
		    Shape shape3 = new Rectangle();  // Create a Rectangle object
		    Shape shape4 = new Triangle();  // Create a Triangle object
		    
		    shape1.draw();  // Call the draw() method of the Shape class
		    shape2.draw();  // Call the draw() method of the Circle class
		    shape3.draw();  // Call the draw() method of the Rectangle class
		    shape4.draw();  // Call the draw() method of the Triangle class
		  }
		}
