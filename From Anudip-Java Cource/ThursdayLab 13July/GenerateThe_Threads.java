package ThursdayLab_13JUly;


/* 
 Q.Write a JAVA program which will generate the threads:
- To display 20 terms of Fibonacci series.
- To display 1 to 9999 in reverse order.
*/

public class GenerateThe_Threads {

    public static void main(String[] args) {
        // Creating two threads :
        Thread thread1 = new Thread(new FibonacciThread()); // print the Fibonacci series
        Thread thread2 = new Thread(new ReverseThread()); // print the numbers in reverse order

        // Start the threads :
        thread1.start();
        thread2.start();

        // Wait for the threads to finish :
        try {
            thread1.join();
            thread2.join();
            /* join() method takes a Thread object as a parameter 
             * and blocks the current thread until the thread object finishes.
             */
        } catch (InterruptedException e) {
            e.printStackTrace();
            //  join() method can throw an InterruptedException if the thread is interrupted
        }
    }
}

class FibonacciThread implements Runnable {

    @Override
    public void run() {
        // Initialize the first two Fibonacci numbers
        int a = 0;
        int b = 1;
        
        System.out.println("Fibonacci Series : ");

        // Print the first 12 Fibonacci numbers
        for (int i = 0; i < 12; i++) {
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }
}

class ReverseThread implements Runnable {

    @Override
    public void run() {
    	
    	 System.out.println("Numbers in Reverse Order : ");
    	 
        // Print the numbers from 9999 to 1 in reverse order
        for (int i = 9999; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
