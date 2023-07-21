

public class Main {
    public static void main(String[] args) {
    	// Creating a new instance of the Car class & assigning it to variable myCar.
    	 Car myCar = new Car("koenigsegg", "agera rs", 2017, "Red"); 
    	 // here "new" is indicating that a new object of the Car class will be created.
    	 
    	 /* In the constructor of the Car class, provided brand "koenigsegg" is passed to the super keyword, 
    	  * which calls the constructor of the Vehicle class and sets the brand attribute to "koenigsegg"
    	  */

         myCar.drive(); // Call the drive method of the Car class
         myCar.honk(); // Call the honk method of the Car class
    }
}
