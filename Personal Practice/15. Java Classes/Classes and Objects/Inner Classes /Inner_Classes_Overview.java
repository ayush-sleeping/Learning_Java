package Classes_and_Objects;

public class Inner_Classes_Overview {
	
	/*  An inner class is a class defined within another class. 
	    It allows you to logically group classes together and increase the encapsulation 
	       and readability of the code. 
	    Inner classes have access to the variables and methods of the outer class, 
	       even if they are private, which makes them useful for implementing certain design patterns 
	       and creating more maintainable code.
	       
	 */
	
	
	/*
	 We also have :
	 "Private Inner Class" and "Access Outer Class From Inner Class", 
	 They are not separate types of inner classes but rather features or characteristics 
	 related to inner classes in Java. 
	 * They add to the versatility and encapsulation capabilities of inner classes.*/
	
	
	/*
	There are four types of inner classes in Java:

		Member Inner Class
		Static Nested Class
		Local Inner Class
		Anonymous Inner Class
	
	This allows the inner class to access the members of the outer class, even the private ones. 
	It provides a way to logically group classes that are only used in one place and enhances encapsulation.
	*/
	
	private int outerData;

	//Inside the Inner_Classes ( OuterClass ), we have defined an inner class named InnerClass.


    public Inner_Classes /*OuterClass*/ (int data) {
        outerData = data;
    }

    // Inner class definition
    public class InnerClass {
        public void innerMethod() {
            System.out.println("Inner method is called");
            System.out.println("Accessing outerData from inner class: " + outerData);
        }
    }

    public static void main(String[] args) {
    	Inner_Classes /*OuterClass*/ outerObj = new Inner_Classes(100);
    	Inner_Classes.InnerClass innerObj = outerObj.new InnerClass();

        innerObj.innerMethod();
    }

}


/* 
  Output :
   Inner method is called
   Accessing outerData from inner class: 100
*/
