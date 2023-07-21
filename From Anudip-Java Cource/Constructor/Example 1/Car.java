

public class Car {
    private String company;
    private String model;
    private int year;

    // Default constructor ( This constructor has no parameters. )
    public Car() {
        company = "Unknown";
        model = "Unknown";
        year = 0;
    }

    // Constructor with company parameter
    public Car(String company) {
        this.company = company;
        model = "Unknown";
        year = 0;
    }

    // Constructor with company and model parameters
    public Car(String company, String model) {
        this.company = company;
        this.model = model;
        year = 0;
    }

    // Constructor with all parameters
    public Car(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Company: " + company);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println();
    }
}
