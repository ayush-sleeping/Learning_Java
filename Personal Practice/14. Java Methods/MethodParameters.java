
public class MethodParameters {
	
	/* Method parameters :  allow you to pass values to a method for it to use during its execution.
	 * Parameters act as placeholders for the values that are provided when calling the method.
	  
	 * Parameters are specified after the method name, inside the parentheses. 
	 * You can add as many parameters as you want, just separate them with a comma.
	 */
	

    public static void greetUser(String name) // a method greetUser that takes a String parameter name.
    {
        System.out.println("Hello, " + name + "!");
    }

   /* When calling the method, we provide a value for the name parameter, 
    * and the method uses that value to greet the user.*/ 
    

    static void myMethod(String fname) {
      System.out.println(fname + " M ");
    }
    
    
    public static void main(String[] args) {
        greetUser("John Wick"); // Output: Hello, John!
        greetUser("Dr.Disrespect"); // Output: Hello, Alice!
        myMethod("Ayush");
    }
}
