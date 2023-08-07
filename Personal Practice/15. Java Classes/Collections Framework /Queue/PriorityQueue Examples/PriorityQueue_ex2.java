package Collection_Framework;

import java.util.PriorityQueue;
//Custom class representing an event
class Event implements Comparable<Event> {
 private String name;
 private int scheduledTime;

 // Constructor to initialize the event with a name and scheduled time
 public Event(String name, int scheduledTime) {
     this.name = name;
     this.scheduledTime = scheduledTime;
 }

 // Getter method to retrieve the name of the event
 public String getName() {
     return name;
 }

 // Getter method to retrieve the scheduled time of the event
 public int getScheduledTime() {
     return scheduledTime;
 }

 // Implementation of the Comparable interface to define the natural ordering of events
 @Override
 public int compareTo(Event other) {
     // Compare events based on their scheduled times
     return Integer.compare(this.scheduledTime, other.scheduledTime);
 }
}

//Main class to demonstrate the usage of Priority Queue with custom objects
public class PriorityQueue_ex2 {
    public static void main(String[] args) {
        // Create a Priority Queue of events
        PriorityQueue<Event> eventQueue = new PriorityQueue<>();

        // Add events to the queue (scheduledTime represents priority)
        eventQueue.add(new Event("Event A", 5));
        eventQueue.add(new Event("Event B", 3));
        eventQueue.add(new Event("Event C", 8));
        eventQueue.add(new Event("Event D", 1));

        // Process events in chronological order
        while (!eventQueue.isEmpty()) {
            Event event = eventQueue.poll();
            System.out.println("Processing event: " + event.getName() + " (Scheduled time: " + event.getScheduledTime() + ")");
        }
    }
}
