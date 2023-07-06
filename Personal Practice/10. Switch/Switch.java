
public class Switch {
	
	/* 
	 * The switch statement is used to select one of many code blocks to be executed 
	 * based on the value of a variable or an expression. 
	 * It provides an alternative to multiple if...else if...else statements 
	 * when there are multiple possible cases.
	 * */
	

    public static void main(String[] args) {
        int dayOfWeek = 3;

        switch (dayOfWeek) {
        // case keyword is followed by the possible "values" of dayOfWeek that we want to check.
            case 1:
                System.out.println("It's Monday!");
                break;
        /* The break statement is used to exit the switch block after 
         * the code for the matching case is executed. */ 
            case 2:
                System.out.println("It's Tuesday!");
                break;
            case 3:
                System.out.println("It's Wednesday!");
                break;
            case 4:
                System.out.println("It's Thursday!");
                break;
            case 5:
                System.out.println("It's Friday!");
                break;
            default:
                System.out.println("It's a weekend day!");
                /* If dayOfWeek doesn't match any of the specified cases, 
                 * the code block under default: is executed, 
                 * and "It's a weekend day!" is printed.*/
        }
        
        /* The switch statement simplifies code readability and 
         * reduces the need for repetitive if...else if...else statements 
         * when dealing with multiple cases.*/
        
    }
}
