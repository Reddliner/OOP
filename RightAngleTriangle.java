/* Lab Record - 8
 * Write a Java program to display the pattern like a right angle triangle with a number.
 * 
 * Test Data:
 * Input number of rows: 5
 * Expected Output:
 * 1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 5 5 5 5 5
 */

import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to input the number of rows
        System.out.print("Input number of rows: ");
        int numRows = scanner.nextInt();
        
        // Close the scanner to prevent resource leak
        scanner.close();
        
        // Loop to iterate through each row
        for (int row = 1; row <= numRows; row++) {
            // Loop to print the number of the current row times in each row
            for (int column = 1; column <= row; column++) {
                System.out.print(row + " ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
