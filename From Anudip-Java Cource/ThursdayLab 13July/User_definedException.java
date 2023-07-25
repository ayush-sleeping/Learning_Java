package ThursdayLab_13JUly;

/* Q. Write a Java program which creates only one object. 
 * If user attempts to create second object, he should not be able to create it. (Using user defined Exception). */



// Custom exception class to handle the case when a second object creation is attempted
class NoMoreObjectException extends Exception {
    public NoMoreObjectException(String message) {
        super(message);
    }
}



//Singleton class to ensure only one object can be created
class Singleton {
 // Private static variable to hold the single instance of the class
 private static Singleton instance;

 // Private constructor to prevent external instantiation
 private Singleton() {
 }

 // Public static method to get the instance of the class
 public static Singleton getInstance() throws NoMoreObjectException {
     // Check if the instance is null (i.e., no object has been created yet)
     if (instance == null) {
         // If the instance is null, create a new object and assign it to the instance variable
         instance = new Singleton();
         return instance;
     } else {
         // If the instance is not null, throw the NoMoreObjectException
         throw new NoMoreObjectException("Cannot create multiple instances of Singleton class.");
     }
 }
}



public class User_definedException {
    public static void main(String[] args) {
        try {
        	// Create the first object of the Singleton class
            Singleton obj1 = Singleton.getInstance();
            System.out.println("1 Object created successfully");
            
            
          Singleton obj2 = Singleton.getInstance();
        } catch (NoMoreObjectException e) {
        	// Catch the NoMoreObjectException and print the error message
            System.out.println("Error: " + e.getMessage());
        }
    }
}





