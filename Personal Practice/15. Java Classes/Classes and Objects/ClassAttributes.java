package Classes_and_Objects;

public class ClassAttributes {
	
	/* Java class attributes, also known as class variables or fields, 
	          are variables declared within a class that hold data associated with the class.
	 
	   These attributes define the characteristics or properties of objects created from the class.  */

	
	 // Class attributes
    String name;
    int age;
    String major;
    /* the Student class has three attributes: name, age, and major. 
     * These attributes represent the information associated with a student.*/

    public static void main(String[] args) {
        // Creating objects of Student class
    	ClassAttributes student1 = new ClassAttributes();
        student1.name = "Ayush";
        student1.age = 20;
        student1.major = "Computer Science";

        ClassAttributes student2 = new ClassAttributes();
        student2.name = "Ahan";
        student2.age = 22;
        student2.major = "Mathematics";
        
        /* Inside the main method, 
         we create two Student objects and set values for their attributes. 
         We then access and display the attribute values using the object references (student1 and student2). */

        // Accessing class attributes
        System.out.println("Student 1 Name: " + student1.name + ", Age: " + student1.age + ", Major: " + student1.major);
        System.out.println("Student 2 Name: " + student2.name + ", Age: " + student2.age + ", Major: " + student2.major);
    }
    
    /* The class attributes hold the specific data for each object, 
     * allowing us to define and manage information related to different students in a structured manner. */
    
}
