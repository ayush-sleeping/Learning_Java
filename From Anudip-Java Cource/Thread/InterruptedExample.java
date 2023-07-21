
public class InterruptedExample {
    public static void main(String[] args) {
        // Create a new thread
        Thread thread = new Thread(() -> {
            // Loop until the thread is interrupted
            while (!Thread.interrupted()) {
                // Perform some work
                System.out.println("Working...");
            }
            // Thread interrupted, print a message
            System.out.println("Thread interrupted");
        });

        // Start the thread
        thread.start();

        // Wait for 3 seconds
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Interrupt the thread
        thread.interrupt();
    }
}

/* The interrupted() method is used within the loop condition to check 
 * if the thread has been interrupted. If the thread has not been interrupted, 
 * it continues with the work. If the thread is interrupted, the loop is exited, 
 * and a message is printed indicating that the thread has been interrupted.
 * */
