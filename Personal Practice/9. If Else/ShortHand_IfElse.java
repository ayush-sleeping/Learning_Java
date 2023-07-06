
public class ShortHand_IfElse {
	
	/*
	 * The shorthand if...else or ternary operator allows you 
	 * to write a compact version of an if...else statement in a single line of code.
	 * It is useful for simple conditional assignments or expressions.
	 */
	
    public static void main(String[] args) {
        int num = 10;
        
        // using ternary operator ? : to assign value of result based on the condition (num > 0).
        String result = (num > 0) ? "Positive" : "Non-positive";
        
        System.out.println("Number is " + result); 
        // Output: Number is Positive
    }
}
