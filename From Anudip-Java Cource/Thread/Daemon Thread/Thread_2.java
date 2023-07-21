import java.util.concurrent.TimeUnit;

public class Thread_2 {
	
	static void greet() {
		System.out.println("Hello");
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch(InterruptedException e) {
			
		}
	}

	public static void main(String[] args) {
		var t = new Thread(Thread_1::greet);
		t.setDaemon(true);
		t.start();

	}

}
