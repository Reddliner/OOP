/* Lab Record - 3
 * 
 * Write a Java program that reads an integer between 0 and 1000 and 
 * adds all the digits in the integer. 
 */

import java.util.Scanner;
/**
 * This program reads an integer between 0 and 1000 from the user
 * and adds all the digits in the integer.
 */
public class DigitSumCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter an integer between 0 and 1000
        System.out.print("Enter an integer between 0 and 1000: ");
        int number = scanner.nextInt();
        
        // Validate if the input number is within the valid range
        if (number < 0 || number > 1000) {
            System.out.println("Invalid input. Please enter an integer between 0 and 1000.");
        } else {
            // Calculate the sum of digits
            int sum = 0;
            int temp = number;
            while (temp > 0) {
                sum += temp % 10; // Add the last digit to the sum
                temp /= 10; // Remove the last digit from the number
            }
            
            // Display the sum of digits
            System.out.println("Sum of digits: " + sum);
        }
        
        // Close the Scanner object
        scanner.close();
    }
}
