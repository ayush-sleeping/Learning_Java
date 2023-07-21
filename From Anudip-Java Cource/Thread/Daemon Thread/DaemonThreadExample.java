
// main class :
public class DaemonThreadExample {

    public static void main(String[] args) {
        // Create a daemon thread
    	/* we create a new thread called daemonThread by passing an instance 
    	 * of the DaemonTask class to the Thread constructor. 
    	 * This thread will execute the code defined in the run method of the DaemonTask class.*/
        Thread daemonThread = new Thread(new DaemonTask());
        daemonThread.setDaemon(true);  /* This indicates that it is a background thread 
        that will not prevent the program from exiting if the main thread finishes execution.*/

        // Start the daemon thread
        daemonThread.start();   /* This initiates the execution of the run method in a separate thread. */

        // Simulate the main program execution :
        // Within the loop, the main thread prints a message indicating the task number it is executing.
        for (int i = 1; i <= 5; i++) {
            System.out.println("Main thread executing task " + i);
            try {
                Thread.sleep(3000); // Pause the main thread for 3 second to create a delay.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Main program execution finished.");
    }
}

class DaemonTask implements Runnable {
    @Override
    public void run() {
    	// Within this loop, the daemon thread prints a message indicating the task number it is executing.
        for (int i = 1; i <= 10; i++) {
            System.out.println("Daemon thread executing task " + i);
            try {
                Thread.sleep(5000); // Pause the daemon thread for 5 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
