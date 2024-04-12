/* Lab Record - 4
 * 
 * Write a Java program that reads a number and displays the square, 
 * cube, and fourth power.
*/

import java.util.Scanner;

/**
 * This program reads a number from the user and displays its square, cube, and fourth power.
 */
public class PowerCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();
        
        // Calculate the square, cube, and fourth power of the number
        double square = number * number;
        double cube = number * number * number;
        double fourthPower = Math.pow(number, 4);
        
        // Display the results
        System.out.println("Square of the number: " + square);
        System.out.println("Cube of the number: " + cube);
        System.out.println("Fourth power of the number: " + fourthPower);
        
        // Close the Scanner object
        scanner.close();
    }
}
