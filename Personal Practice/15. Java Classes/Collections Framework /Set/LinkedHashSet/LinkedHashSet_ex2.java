package Collection_Framework;

// we'll use a LinkedHashSet to maintain a collection of unique usernames in the order they are registered.
// Maintaining Unique Usernames ::


import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_ex2 {
    public static void main(String[] args) {
        // Declaration and Initialization of a LinkedHashSet
        Set<String> uniqueUsernames = new LinkedHashSet<>();

        // Registering unique usernames in order
        uniqueUsernames.add("alice");
        uniqueUsernames.add("bob");
        uniqueUsernames.add("charlie");
        uniqueUsernames.add("alice"); // Duplicate (ignored)

        // Printing the unique usernames in registration order
        System.out.println("Unique Usernames: " + uniqueUsernames);
    }
}
/* Here, we use a LinkedHashSet to maintain a collection of unique usernames as users register. 
   The order of registration is preserved, and any duplicate usernames are automatically ignored. */
 
