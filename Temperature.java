package temperature;
import java.util.Scanner;

/**
 *
 * @author Ayush
 */
public class Temperature {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        System.out.println("Give in the Celsius Value:");
        Scanner sc = new Scanner(System.in);
        
        double celsius = sc.nextDouble();
        double fahrenheit = 9.0 / 5.0 * celsius + 32.0;
        
        System.out.println("Fahrenheit:" +fahrenheit);
        
    }
    
