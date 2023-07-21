/* static boolean interrupted(): This method is used to check 
 * if the current thread has been interrupted. It returns a boolean value
 *  indicating whether the interrupt flag has been set for the current thread. 
 *  If the interrupt flag is set, the method returns true, otherwise it returns false.
*/

public class InterruptedExample_Basic {
    public static void main(String[] args) {
        Thread.currentThread().interrupt(); // Set the interrupt flag for the current thread

        System.out.println(Thread.interrupted()); // Check if interrupted, prints true
        System.out.println(Thread.interrupted()); 
        // Check again, prints false (interrupt flag is cleared)
    }
}

/* It not only checks the interrupt status but also clears the interrupt flag. 
 * This means that calling Thread.interrupted() will return true if the thread 
 * is interrupted and clear the interrupt flag. On subsequent calls, it will 
 * return false because the interrupt flag has been cleared.
 */