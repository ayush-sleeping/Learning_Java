package Collection_Framework;

/*
     Keeping Track of Upcoming Events ::
         In this example, we'll use a TreeSet to keep track of upcoming events based on their dates.
*/
import java.util.SortedSet;
import java.util.TreeSet;

class UpcomingEvent implements Comparable<UpcomingEvent> {
   private String name;
   private String date;

   public UpcomingEvent(String name, String date) {
       this.name = name;
       this.date = date;
   }

   @Override
   public int compareTo(UpcomingEvent other) {
       return this.date.compareTo(other.date);
   }

   @Override
   public String toString() {
       return name + " (Date: " + date + ")";
   }
}

public class SortedSet_ex2 {
   public static void main(String[] args) {
       // Declaration and Initialization of a SortedSet
       SortedSet<UpcomingEvent> upcomingEvents = new TreeSet<>();

       // Adding events to the SortedSet
       upcomingEvents.add(new UpcomingEvent("Conference", "2023-08-15"));
       upcomingEvents.add(new UpcomingEvent("Workshop", "2023-07-25"));
       upcomingEvents.add(new UpcomingEvent("Seminar", "2023-09-10"));

       // Printing the upcoming events in date order
       System.out.println("Upcoming Events: " + upcomingEvents);
   }
}
/* Here, we want to keep track of upcoming events and display them in chronological order. 
 * Using a SortedSet such as TreeSet, we can ensure that the events are stored and retrieved based on their dates. 
 * The compareTo method in the UpcomingEvent class defines the sorting order. */




