/* Lab Record - 10
 * Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.
 * 
 * Test Data:
 * Input number of rows: 4
 * Expected Output:
 *    1
 *   2 2
 *  3 3 3
 * 4 4 4 4
 */

import java.util.Scanner;

/**
 * This program generates a pyramid pattern with numbers repeating in the same row.
 * The number of rows and the numbers in each row are specified by the user.
 */
public class StarPyramid {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input the number of rows for the pyramid
        System.out.print("Input number of rows: ");
        int numberOfRows = scanner.nextInt();
        
        // Close the scanner to prevent resource leak
        scanner.close();
        
        // Calculate the maximum width of each row in the pyramid
        int maxWidth = 2 * numberOfRows - 1;
        
        // Loop to iterate through each row of the pyramid
        for (int currentRow = 1; currentRow <= numberOfRows; currentRow++) {
            // Calculate the number of spaces to print before the numbers
            int spacesBeforeNumbers = (maxWidth - (2 * currentRow - 1)) / 2;
            
            // Print spaces before the numbers to center-align the pyramid
            for (int spaces = 1; spaces <= spacesBeforeNumbers; spaces++) {
                System.out.print(" ");
            }
            
            // Print the numbers in the current row
            for (int currentNumber = 1; currentNumber <= currentRow; currentNumber++) {
                // Print the current row number with a space
                System.out.print(currentRow + " ");
            }
            
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
