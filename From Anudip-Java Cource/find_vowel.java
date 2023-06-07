import java.util.Scanner;
public class find_vowel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your character");
		char word=sc.next().charAt(0);
		
		word=Character.toLowerCase(word);
		
		if(word=='a'|| word=='e'|| word=='i'|| word=='o'|| word=='u') {
			System.out.println(word+ " : is a vowel ");
		}else {
			System.out.println(word+ " : istnot a vowel");
		}
	}

}


