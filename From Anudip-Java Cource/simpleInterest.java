import java.util.Scanner;
public class simpleInterest {
	


	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter principle amt");
		double principle=sc.nextDouble();
		
		System.out.println("Enter rate");
		double rate=sc.nextDouble();
		
		System.out.println("Enter time");
		double time=sc.nextDouble();
		
	
		double simpleinterest=(principle*rate*time)/100;
		System.out.println("The simple interest is " +simpleinterest);
		
		
		
	}

}


