/* Lab Record - 14
 * Write a Java program to get a day of the week on a specific date.
 */

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DayOfWeek {
    public static void main(String[] args) {
        // Specify the date for which you want to find the day of the week
        int year = 2024;
        int month = Calendar.APRIL; // Calendar.MONTH starts from 0 for January
        int dayOfMonth = 12;

        // Create a Calendar instance and set the specified date
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, dayOfMonth);

        // Convert Calendar instance to Date
        Date date = calendar.getTime();

        // Format the date to show the day of the week
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE");
        String dayOfWeek = dateFormat.format(date);

        // Print the day of the week
        System.out.println("The day of the week for " + dayOfMonth + "/" + (month + 1) + "/" + year + " is: " + dayOfWeek);
    }
}
