package Threads;

public class Priorities_Thread {


    public static void main(String[] args) {
        // Create five threads
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        Thread thread3 = new Thread(new MyRunnable(), "Thread 3");
        Thread thread4 = new Thread(new MyRunnable(), "Thread 4");
        Thread thread5 = new Thread(new MyRunnable(), "Thread 5");

        // Set the priorities of the threads
        thread1.setPriority(Thread.MIN_PRIORITY);     // Set the priority of thread1 to the minimum priority (1)
        thread2.setPriority(Thread.NORM_PRIORITY);    // Set the priority of thread2 to the default priority (5)
        thread3.setPriority(Thread.MAX_PRIORITY);     // Set the priority of thread3 to the maximum priority (10)
        thread4.setPriority(3);                       // Set the priority of thread4 to a custom priority (3)
        thread5.setPriority(7);                       // Set the priority of thread5 to a custom priority (7)

        // Start all threads
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

    // Simple implementation of the Runnable interface
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            // Display the name and priority of the running thread
            System.out.println("Running thread: " + Thread.currentThread().getName()
                    + ", Priority: " + Thread.currentThread().getPriority());
        }
    }
}

/* The thread priorities range from 1 (minimum) to 10 (maximum). 
 * The JVM's thread scheduler uses these priorities as hints for scheduling threads, 
 * but the exact behavior may vary across different platforms and JVM implementations.
 * */
