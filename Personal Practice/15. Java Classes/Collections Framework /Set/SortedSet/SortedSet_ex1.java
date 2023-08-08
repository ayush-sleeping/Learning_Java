package Collection_Framework;

/* In this example, 
      We'll use a TreeSet (implementation of SortedSet) to maintain a sorted list of tasks based on their priority.
   Maintaining a Sorted List of Tasks ::
*/

import java.util.SortedSet;
import java.util.TreeSet;

class Task implements Comparable<Task> {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class SortedSet_ex1 {
    public static void main(String[] args) {
        // Declaration and Initialization of a SortedSet (using TreeSet)
        SortedSet<Task> tasks = new TreeSet<>();

        // Adding tasks to the SortedSet
        tasks.add(new Task("Write report", 3));
        tasks.add(new Task("Prepare presentation", 1));
        tasks.add(new Task("Review code", 2));

        // Printing the tasks in priority order
        System.out.println("Tasks: " + tasks);
    }
}

/* In this scenario, 
      we want to maintain a sorted list of tasks based on their priority. 
      Using a SortedSet such as TreeSet allows us to automatically maintain the order of tasks based 
      on their priority. The compareTo method in the Task class defines the sorting order.
 */

