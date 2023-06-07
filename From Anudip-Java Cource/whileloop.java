import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the minimum value: ");
        int min = scanner.nextInt();

        System.out.print("Enter the maximum value: ");
        int max = scanner.nextInt();

        System.out.println("Numbers between " + min + " and " + max + ":");

       
        while (min <= max) {
            System.out.println(min);
            min++;
        }
    }
}
