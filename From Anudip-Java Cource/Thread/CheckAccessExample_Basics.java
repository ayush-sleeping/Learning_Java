

/* The checkAccess() method in Java is used to determine if the currently running thread 
 * has permission to modify another thread. It checks whether the security manager allows 
 * the current thread to access or modify the specified thread.*/


public class CheckAccessExample_Basics {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        // We create a Thread object named thread and pass an instance of the MyRunnable class to it.

        try {
            thread.checkAccess();
            System.out.println("Current thread has permission to modify itself.");
        } catch (SecurityException e) {
            System.out.println("Current thread does not have permission to modify itself.");
        }   /* try-catch block to catch the SecurityException that may be thrown by the 
        checkAccess() method.
        attempt to call the checkAccess() method on the thread object. 
        If the current thread has permission to modify itself, no exception will be thrown.  */
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread is running.");
        }
    }
}