
public class Encapsulation {
	
	/* Encapsulation is a concept in Java that involves bundling data 
	 * and methods within a class and controlling access to them using access modifiers 
	             (public, private, protected).
	 * It ensures data security and provides a way to interact with the object through methods.
	   
	   
	 * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
	 * To achieve this, you must:
	              declare class variables/attributes as private
	              provide public get and set methods to access and update the value of a private variable
	 */

	    // private instance variables
	    private String name;
	    private int age;

	    // public getter and setter methods
	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public static void main(String[] args) {
	    	Encapsulation student = new Encapsulation();
	        student.setName("Ayush");
	        student.setAge(20);
	        System.out.println("Student name: " + student.getName());
	        System.out.println("Student age: " + student.getAge());
	    }
	    
	    /* By encapsulating the data and providing getter and setter methods, 
	     * we can control access to the variables and ensure proper interaction with the object.*/
	}

