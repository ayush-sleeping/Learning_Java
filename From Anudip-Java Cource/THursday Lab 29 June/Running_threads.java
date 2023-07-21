

public class Running_threads {

    public static void main(String[] args) {
        // Create two threads using the Thread class and pass an instance of MyRunnable as the target
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");

        // Start both threads
        // This will invoke the run() method of the MyRunnable instance associated with thread1 and thread2.
        thread1.start();  
        thread2.start();   

        // Change the name of the main thread
        Thread.currentThread().setName("Main Thread");

        
        // Get all running threads
        Thread[] allThreads = new Thread[Thread.activeCount()];
        
        // Thread.activeCount() method returns the number of active threads.
        Thread.enumerate(allThreads);
        // Populate the allThreads array with all the running threads using the Thread.enumerate(Thread[] tarray) method.

        System.out.println("All running threads:");

        
        
        // Iterate through the running threads and display their names
        for (Thread thread : allThreads) {
            System.out.println(thread.getName());
        }
    }

    
    
    // Simple implementation of the Runnable interface
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            // Display the name of the running thread
            System.out.println("Running thread: " + Thread.currentThread().getName());
        }
    }
    
    
}

