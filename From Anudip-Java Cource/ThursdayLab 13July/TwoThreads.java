package ThursdayLab_13JUly;
/* Q. Write a program that creates 2 threads - 
 * each displaying a message (Pass the message as a parameter to the constructor). 
 * The threads should display the messages continuously till the user presses ctrl+c.
 */


import java.util.Scanner;

public class TwoThreads {

    public static void main(String[] args) {
        // Create two threads, each with a different message :
        Thread thread1 = new Thread(new MessagePrinter("1 : First Message ......"));
        Thread thread2 = new Thread(new MessagePrinter("2 : Second Message ................"));

        // Start the threads :
        thread1.start();
        thread2.start();

        // Wait for the user to terminate the program :
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        // Terminate the threads :
        thread1.interrupt();
        thread2.interrupt();
    }
}

class MessagePrinter implements Runnable {
	// MessagePrinter class has a constructor that takes a String message as a parameter :

    private String message;
    // This message field stores the message that the thread will print :

    public MessagePrinter(String message) {
        this.message = message;
        // The constructor stores the message in the message field :
    }

    @Override
    public void run() {
    	// The run() method prints the message field repeatedly until the thread is interrupted :
        while (true) {
            System.out.println(message);
            // The while loop will continue to run until the thread is interrupted. 
        }
    }
}
