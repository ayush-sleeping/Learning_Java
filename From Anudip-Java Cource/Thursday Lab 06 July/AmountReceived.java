public class AmountReceived extends Thread {

    public void run() {
        try {
            // Print waiting message
            System.out.println("Waiting for the amount to be received...");
            
            // Sleep for a few seconds to simulate waiting
            Thread.sleep(2000);
            
            // Print waiting message two more times
            System.out.println("Waiting for the amount to be received...");
            Thread.sleep(2000);
            System.out.println("Waiting for the amount to be received...");
            
            // Print success message
            System.out.println("Amount received successfully!");
        } catch (InterruptedException e) {
            System.out.println("An error occurred while waiting for the amount.");
            e.printStackTrace();
        }
    }
}
