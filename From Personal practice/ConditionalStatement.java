
public class ConditionalStatement {

	public static void main(String[] args) {
		
		// Conditional Statement :
		
		int age = 16;
		
		if(age > 18) {
			System.out.println("You can Vote");
		} else {
			System.out.println("You can'nt Vote");
		}
		
		
		// Else if :
		
		char grade = 'E';
		
		if(grade == 'A') {
			System.out.print("Your grade is good");
		} else if(grade == 'B') {
			System.out.print("Good, Keep learning");
		} else if(grade == 'D') {
			System.out.print("Need Improvement");
		} else {
			System.out.print("Invalid Grade");
		}
		
		
		// Switch Case :
		
		char grade2 = 'A';
		
		switch(grade2) {
		case 'A':
			System.out.print("Your grade is good");
			break;
		case 'B':
			System.out.print("Good, Keep learning");
			break;
		case 'C':
			System.out.print("Need Improvement");
			break;
		default:
			System.out.print("Invalid Grade");
		}
		
	}

}
