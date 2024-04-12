/* Lab Record - 5
 * Write a Java program that takes three numbers from the user and 
 * prints the greatest number. 
 * 
 * Test Data Input the 1st number: 25 Input the 2nd number: 78 Input the 3rd number: 87
*/
import java.util.Scanner;

/**
 * This program takes three numbers from the user and prints the greatest number.
 */
public class GreatestNumberFinder {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first number
        System.out.print("Input the 1st number: ");
        int num1 = scanner.nextInt();
        
        // Prompt the user to enter the second number
        System.out.print("Input the 2nd number: ");
        int num2 = scanner.nextInt();
        
        // Prompt the user to enter the third number
        System.out.print("Input the 3rd number: ");
        int num3 = scanner.nextInt();
        
        // Find the greatest number among the three numbers
        int greatestNumber = num1; // Assume the first number is the greatest initially
        
        if (num2 > greatestNumber) {
            greatestNumber = num2;
        }
        
        if (num3 > greatestNumber) {
            greatestNumber = num3;
        }
        
        // Print the greatest number
        System.out.println("The greatest number is: " + greatestNumber);
        
        // Close the Scanner object
        scanner.close();
    }
}