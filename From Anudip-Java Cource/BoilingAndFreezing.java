
import java.util.Scanner;
public class BoilingAndFreezing {

  
    public static void main(String[] args) {
           
        System.out.println("Give in the temperature:");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        
        if (temp >= 100) {
            System.out.println("The water is boiling. ");
        } else if (temp <= 0 ) {
            System.out.println("The Water is freezing. ");
        } else {
            System.out.println("The Water is in normal state. ");
        }
    }    
}