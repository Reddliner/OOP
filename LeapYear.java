/* Lab Record - 7
 * Write a Java program that takes a year from the user and prints whether it is a leap year or not.
 * 
 * Test Data: 
 * Input a year: 2016
 * Expected Output :
 * 2016 is a leap year
 */

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input the year
        System.out.print("Input a year: ");
        int year = scanner.nextInt();
        
        // Close the scanner to prevent resource leak
        scanner.close();
        
        // Check if the year is a leap year
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
