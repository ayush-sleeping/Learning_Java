
public class ExceptionHandling {

	public static void main(String[] args) {
		// Exception Handling , Because of this program never crash ...
		
		int a[] = new int[5];
		try {
			System.out.println(a[6]);
		} catch(Exception e){
			System.out.println("THis error is coming :");
			System.out.println(e.getLocalizedMessage());
		}

		System.out.println(" Next statement ");
	}

}
