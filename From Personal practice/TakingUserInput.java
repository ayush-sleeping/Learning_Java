import java.util.Scanner;

public class TakingUserInput {

	public static void main(String[] args) {
		
		// Here User will give Input Values : 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age : ");
		
		int age = sc.nextInt(); 
		System.out.println(age);
	}

}
