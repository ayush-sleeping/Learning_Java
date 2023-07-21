
public class Main {
    public static void main(String[] args) {
        // Create Car objects using different constructors

        Car car1 = new Car(); // Create a car object using the default constructor
        Car car2 = new Car("Toyota"); // Create a car object with company "Toyota"      
        Car car3 = new Car("Honda", "Civic"); // Create a car object with company "Honda" and model "Civic"      
        Car car4 = new Car("Ford", "Mustang", 2022); // Create a car object with company "Ford", model "Mustang", and year 2022

        
        // Display car information
        car1.displayInfo(); // Display the information of car1   
        car2.displayInfo(); // Display the information of car2     
        car3.displayInfo(); // Display the information of car3     
        car4.displayInfo(); // Display the information of car4
    }
}
