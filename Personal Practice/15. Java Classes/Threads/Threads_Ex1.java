package Threads;

public class Threads_Ex1 implements Runnable
//  the ThreadExample class implements the Runnable interface, which defines the run() method. 
{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread: " + Thread.currentThread().getId() + " - Count: " + i);
            
            // This method contains the code to be executed by the threads. 
            // The run() method simply prints the thread ID and a count from 0 to 4.
        }
    }

    public static void main(String[] args) {
    	Threads_Ex1 threadExample = new Threads_Ex1();
        Thread thread1 = new Thread(threadExample);
        Thread thread2 = new Thread(threadExample);
        
        /* In the main() method, we create two Thread objects (thread1 and thread2) 
            and pass the ThreadExample instance as a parameter. */

        thread1.start();
        thread2.start();
        
        // hen start both threads using the start() method.

/* When the program runs, two threads are created 
           and execute the run() method concurrently. As a result, 
           the output shows the interleaved execution of the two threads, 
           each printing its own thread ID and the count.
 */
        
        
    }
}
