import java.util.Scanner;

public class loop_findminmax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     // taking minimum number value from user
        System.out.print("Enter the minimum value: ");
        int min = scanner.nextInt(); 

     // taking maximum number value from user
        System.out.print("Enter the maximum value: ");
        int max = scanner.nextInt(); 

        System.out.println("Numbers between " + min + " and " + max + ":");
     // using loop to set the condition 
        
        for (int i = min; i <= max; i++) { 
        	// now printing the numbers between them
            System.out.println(i); 
        }
    }
}
