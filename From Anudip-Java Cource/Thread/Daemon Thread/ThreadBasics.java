package ThreadPart;

public class ThreadBasics {
    public static void main(String[] args) {
        // Create two ThreadDemo objects
        ThreadDemo t1 = new ThreadDemo();
        ThreadDemo t2 = new ThreadDemo();
        
   // Set t2 as a daemon thread ( daemon thread are created using the 'setDaemon(true)' method of THread Class.)
        t2.setDaemon(true);
        
        // Start both threads
        t1.start();
        t2.start();
    }
}
class ThreadDemo extends Thread {
    @Override
    public void run() {
        // Check if the current thread is a daemon thread
        if (Thread.currentThread().isDaemon())
            System.out.println("Thread is daemon");
        else
            System.out.println("No Daemon thread");
    }
}
