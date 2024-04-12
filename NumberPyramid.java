/* Lab Record - 11
 * Write a Java program to make such a pattern like a pyramid with a number that repeats in the same row.
 * 
 * Example:
 * Enter the number of rows for the pyramid: 4
 * Expected Output:
 *    1
 *   2 2
 *  3 3 3
 * 4 4 4 4
 */

import java.util.Scanner;

/**
 * This program generates a pyramid pattern with numbers repeating in the same row.
 */
public class NumberPyramid {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the number of rows for the pyramid
        System.out.print("Enter the number of rows for the pyramid: ");
        int numberOfRows = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Loop to iterate through each row of the pyramid
        for (int currentRow = 1; currentRow <= numberOfRows; currentRow++) {
            // Print spaces before the numbers to align the pyramid
            for (int spaces = numberOfRows - currentRow; spaces > 0; spaces--) {
                System.out.print(" ");
            }

            // Print numbers in increasing order
            for (int num = 1; num <= currentRow; num++) {
                System.out.print(currentRow + " ");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
