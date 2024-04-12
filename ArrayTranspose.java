/* Lab Record - 2
 * 
 * Write a Java program to print an array after changing the 
 * rows and columns of a two-dimensional array.
*/

/**
 * This program demonstrates the concept of transposing a two-dimensional array.
 * Transposing essentially means swapping the rows and columns of a matrix.
 * It illustrates how to perform this operation and displays the original and transposed arrays.
 */

public class ArrayTranspose {
    public static void main(String[] args) {
        // Define a sample 2D array representing a matrix
        int[][] originalArray = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        // Transpose the original array
        int[][] transposedArray = transpose(originalArray);
        
        // Print the original array
        System.out.println("Original Array:");
        printArray(originalArray);
        
        // Print the transposed array
        System.out.println("\nTransposed Array:");
        printArray(transposedArray);
    }
    
    /**
     * Transposes a given 2D array.
     * 
     * @param array The original 2D array to be transposed.
     * @return The transposed 2D array.
     */
    public static int[][] transpose(int[][] array) {
        // Determine the dimensions of the original array
        int rows = array.length; // Number of rows
        int columns = array[0].length; // Number of columns
        
        // Create a new array to hold the transposed data
        int[][] transposed = new int[columns][rows]; // Rows become columns, columns become rows
        
        // Perform the transposition
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                // Swap rows and columns
                transposed[j][i] = array[i][j];
            }
        }
        
        // Return the transposed array
        return transposed;
    }
    
    /**
     * Prints the contents of a given 2D array.
     * 
     * @param array The 2D array to be printed.
     */
    public static void printArray(int[][] array) {
        // Loop through each row
        for (int i = 0; i < array.length; i++) {
            // Loop through each column
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " "); // Display the element
            }
            System.out.println(); // Move to the next row
        }
    }
}
