/* static int activeCount(): This method returns an estimate of the number 
 * of active threads in the current thread's thread group and its subgroups.
 * */

public class ActiveCountExample_Basic {
    public static void main(String[] args) {
        // Get the current thread group
        ThreadGroup group = Thread.currentThread().getThreadGroup();
        
        // Print the number of active threads in the thread group
        System.out.println("Active thread count: " + group.activeCount());
    }
}

/* Thread.currentThread() - Retrieves the current thread.
   getThreadGroup() - Gets the thread group that the current thread belongs to.
   ThreadGroup group = ... - Assigns the thread group to the group variable.
   
   The code retrieves the thread group of the main thread and 
   prints the number of active threads in that group.
*/