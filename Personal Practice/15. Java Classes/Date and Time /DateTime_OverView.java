package Date_Time;

/* Java Date and Time API, introduced in Java 8, provides classes to work with 
        dates, times, time zones, and durations in a more efficient and flexible way compared to 
        the older java.util.Date and java.util.Calendar classes.   */


/* Here are some key classes and concepts in the Java Date and Time API:
 
 * LocalDate: Represents a date without time or time zone information.
 * LocalTime: Represents a time without date or time zone information.
 * LocalDateTime: Represents a date and time without time zone information.
 * ZonedDateTime: Represents a date and time with time zone information.
 * Duration: Represents a time span or duration between two instants.
 * Period: Represents a date-based amount of time.
 * DateTimeFormatter: Formats and parses date and time objects. 
 
 */

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 

public class DateTime_OverView {
	
	
    public static void main(String[] args) {
        // LocalDate example
        LocalDate date = LocalDate.now();
        System.out.println("Current date: " + date);

        // LocalTime example
        LocalTime time = LocalTime.now();
        System.out.println("Current time: " + time);

        // LocalDateTime example
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Current date and time: " + dateTime);

        // Formatting date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateTime.format(formatter);
        System.out.println("Formatted date and time: " + formattedDateTime);

        // Parsing date and time from a string
        String strDateTime = "2023-05-30 12:30:45";
        LocalDateTime parsedDateTime = LocalDateTime.parse(strDateTime, formatter);
        System.out.println("Parsed date and time: " + parsedDateTime);
    }
    
    
}


/* The output of this code will vary each time it is executed, 
   as it shows the current date, time, and date-time. However, 
   the DateTimeFormatter will always produce the same formatted output for the given date and time.
   
   
   Using the Java Date and Time API simplifies date and time operations, reduces the risk of errors, 
   and enhances code readability. It also provides better support for internationalization 
   and time zone handling. */


