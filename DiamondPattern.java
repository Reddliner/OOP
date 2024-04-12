/* Lab Record - 9
 * Write a Java program to display the pattern like a diamond.
 * 
 * Test Data:
 * Input number of rows (half of the diamond): 5
 * Expected Output:
 *     *
 *    ***
 *   *****
 *  *******
 * *********
 *  *******
 *   *****
 *    ***
 *     *
 */

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input the number of rows (half of the diamond)
        System.out.print("Input number of rows (half of the diamond): ");
        int rows = scanner.nextInt();
        
        // Close the scanner to prevent resource leak
        scanner.close();
        
        // Loop to print the upper half of the diamond
        for (int i = 1; i <= rows; i++) {
            // Print spaces before the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
        
        // Loop to print the lower half of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            // Print spaces before the stars
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
