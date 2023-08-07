package Collection_Framework;

import java.util.PriorityQueue;

public class PriorityQueue_ex1 {
    public static void main(String[] args) {
        // Create a Priority Queue of tasks (represented by integers)
        PriorityQueue<Integer> taskQueue = new PriorityQueue<>();

        // Add tasks to the queue (lower number represents higher priority)
        taskQueue.add(3);
        taskQueue.add(1);
        taskQueue.add(5);
        taskQueue.add(2);
        taskQueue.add(4);

        // Process tasks in priority order
        while (!taskQueue.isEmpty()) {
            int task = taskQueue.poll();
            /*
             Inside the loop, the poll() method is used to remove and retrieve the highest-priority 
             element (smallest value) from the queue. It assigns the value to the variable task.*/
            System.out.println("Processing task with priority: " + task);
        }
    }
}
