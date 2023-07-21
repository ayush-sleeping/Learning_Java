public class Vehicle {
    public String brand;
    public String model;
    public int year;

    public Vehicle(String brand, String model, int year) {
    	this.brand = brand; // Initialize the brand attribute with the given value
        this.model = model; // Initialize the model attribute with the given value
        this.year = year; // Initialize the year attribute with the given value
    }

    public void drive() {
        System.out.println("Driving the vehicle...");
        System.out.println("Brand: " + brand); // Print the brand of the vehicle
        System.out.println("Model: " + model); // Print the model of the vehicle
        System.out.println("Year: " + year); // Print the year of the vehicle
    }
}
