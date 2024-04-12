/* Lab Record - 6
 * Write a Java program that reads two floating-point numbers and tests whether they are the same * up to three decimal places. 
 * 
 * Test Data Input floating-point number 1: 125.265 Input floating-point number 2: 125.266
 */

import java.util.Scanner;

public class CompareFloatingPoint {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input the first floating-point number
        System.out.print("Input floating-point number 1: ");
        double num1 = scanner.nextDouble();
        
        // Prompt the user to input the second floating-point number
        System.out.print("Input floating-point number 2: ");
        double num2 = scanner.nextDouble();
        
        // Close the scanner to prevent resource leak
        scanner.close();
        
        // Round the numbers to three decimal places
        // Multiply by 1000, round to the nearest integer, then divide by 1000 to keep three decimal places
        double roundedNum1 = Math.round(num1 * 1000.0) / 1000.0;
        double roundedNum2 = Math.round(num2 * 1000.0) / 1000.0;
        
        // Check if the rounded numbers are the same
        if (roundedNum1 == roundedNum2) {
            // If the rounded numbers are the same, print a message indicating they are equal
            System.out.println("The two numbers are the same up to three decimal places.");
        } else {
            // If the rounded numbers are different, print a message indicating they are not equal
            System.out.println("The two numbers are not the same up to three decimal places.");
        }
    }
}
