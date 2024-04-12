/* Lab Record - 23
 * Write a Java program to trim leading or trailing whitespace from a given string.
 */

import java.util.Scanner;

public class WhitespaceTrimmer {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string with leading/trailing whitespace
        System.out.print("Enter a string with leading/trailing whitespace: ");
        String inputString = scanner.nextLine();
        
        // Trim leading and trailing whitespace from the input string
        String trimmedString = inputString.trim();

        // Display the trimmed string
        System.out.println("Trimmed string: \"" + trimmedString + "\"");
        
        // Close the scanner
        scanner.close();
    }
}
/* Explanation:
 * The trim() method is used to remove leading and trailing whitespace from a string.
 * It returns a new string with whitespace removed from the beginning and end.
 */
