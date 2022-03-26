package replace.the.value.of.pkg2.variables;

/**
 *
 * @author Ayush
 */
public class ReplaceTheValueOf2Variables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int first = 7;
        int second = 19;
        int third;
        
        third = second;
        second = first;
        first = third;
        
        System.out.println("first=" + first + " second=" +second);
    }
    
}
