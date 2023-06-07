import java.util.Scanner;

public class circumference_area {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the radius");
		double radius=sc.nextDouble();
		
		double circumference=2*Math.PI*radius;
		
		double area=Math.PI*radius *radius;
		
		System.out.println("The circumference of circle ="+circumference);
		System.out.println("The Area of Circle is =" +area);
	}

}


