/* Lab Record - 12
 * Write a Java program to create a Date object using the Calendar class.
 */

import java.util.Calendar;
import java.util.Date;

/**
 * This program demonstrates creating a Date object using the Calendar class.
 */
public class DateCreation {
    public static void main(String[] args) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();
        
        // Set the desired date components
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.APRIL); // Calendar.MONTH starts from 0 for January
        calendar.set(Calendar.DAY_OF_MONTH, 12);
        
        // Convert the Calendar object to a Date object
        Date date = calendar.getTime();
        
        // Print the created Date object
        System.out.println("Date created using Calendar class: " + date);
    }
}
