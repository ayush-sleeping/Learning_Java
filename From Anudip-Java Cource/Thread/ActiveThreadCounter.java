public class ActiveThreadCounter {
    public static void main(String[] args) {
    	// we create a new ThreadGroup called "MyThreadGroup". 
        ThreadGroup group = new ThreadGroup("MyThreadGroup");

        // Then, we create three threads and assign them to the thread group.
        // Each thread executes a Runnable task that sleeps for 1 second.
        Thread thread1 = new Thread(group, new MyRunnable());
        Thread thread2 = new Thread(group, new MyRunnable());
        Thread thread3 = new Thread(group, new MyRunnable());

        thread1.start();
        thread2.start();
        thread3.start();
        
        // we use activeCount() to get the number of active threads in the thread group. 
        // In this case, since the threads are actively running, we expect the count to be 3.

        int activeThreads = group.activeCount();
        System.out.println("Number of active threads in the group: " + activeThreads);
    }

    static class MyRunnable implements Runnable {
    	// The Runnable interface defines a single method run() that represents 
    	// the task that will be executed by a thread.
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
   // The sleep() method pauses the execution of the thread for the specified duration.
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

/* The sleep() method can throw an InterruptedException 
 * if the thread is interrupted while sleeping. 
 * To handle this exception, we catch InterruptedException 
 * and call Thread.currentThread().interrupt() to re-interrupt the thread. 
 * This ensures that the interrupted status of the thread is preserved.
 * */
