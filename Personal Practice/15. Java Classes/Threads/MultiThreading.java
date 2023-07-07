package Threads;

public class MultiThreading {
	
	/* Multithreading in Java refers to the ability of a program to execute
	         multiple threads concurrently. 
	 *  A thread is a lightweight unit of execution within a process. 
	 *  Multithreading allows you to perform multiple tasks simultaneously, 
	         improving the efficiency and responsiveness of your program.
	 */

	 public static void main(String[] args) {
	        // Create and start the first thread ( implement the Runnable interface. )
	        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
	        thread1.start();

	        // Create and start the second thread
	        Thread thread2 = new Thread(new MyRunnable("Thread 2"));
	        thread2.start();
	    }
	}

	class MyRunnable implements Runnable {
	    private String name;

	    public MyRunnable(String name) {
	        this.name = name;
	    }

	    public void run()
	    // The run() method prints a sequence of numbers with a delay of 1 second between each number.
	    {
	        for (int i = 1; i <= 5; i++) {
	            System.out.println(name + ": " + i);
	            try {
	                Thread.sleep(1000); // Pause for 1 second
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	    
	    /* When we run the program, both threads start executing concurrently, 
	     * printing their respective sequences of numbers.
	     */
	    
}
