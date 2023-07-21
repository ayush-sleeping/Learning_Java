
public class MultipleThread_InJava {
    
    public static void main(String[] args) {
    	// a loop that creates and starts 7 threads
        for (int i = 1; i <= 7; i++) {
        	// Create a new Thread object, passing an instance of MyRunnable with a unique thread number
            Thread thread = new Thread(new MyRunnable(i)); 
         // Start the thread, which will execute the run method of the MyRunnable instance
            thread.start(); 
        }
    }
    
    // an inner class MyRunnable that implements the Runnable interface
    // MyRunnable class represents the task that each thread will execute.

    static class MyRunnable implements Runnable {
        private int threadNumber;
        
        public MyRunnable(int threadNumber) {
        	// Assign the provided thread number to the instance variable
            this.threadNumber = threadNumber; 
        }
        
        @Override
        /* When a thread is started, it will execute the run method of the MyRunnable instance, 
         * which simply prints a message indicating the thread number.*/
        public void run() {
        	// Print a message indicating the thread number
            System.out.println("Thread " + threadNumber + " is running."); 
        }
    }
}
