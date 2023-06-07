import java.util.*;
public class find_greatest_no {
	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first value");
		int num1=sc.nextInt();
		
		System.out.println("Enter the second value");
		int num2=sc.nextInt();
		
		System.out.println("Enter the third value");
		int num3=sc.nextInt();
		
		int greatest=num1;
		

        if (num2 > greatest) {
            greatest = num2;
        }

        if (num3 > greatest) {
            greatest = num3;
        }

        System.out.println("The greatest number is: " + greatest);
        }

}
