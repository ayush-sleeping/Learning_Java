
public class Car extends Vehicle {
    private String color;

    public Car(String brand, String model, int year, String color) {
    	  super(brand, model, year); 
    	  /* This above line is calling subclass (Car), which is giving properties from its superclass (Vehicle) */
          this.color = color; // Initialize the color attribute with the given value
      }


    public void honk() {
    	 System.out.println("Beep beep! Honking the car horn...");
         System.out.println("Color: " + color); // Print the color of the car
     }
}
