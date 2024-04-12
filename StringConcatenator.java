/* Lab Record - 22
 * Write a Java program to concatenate a given string to the end of another string.
 */

import java.util.Scanner;

public class StringConcatenator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();
        
        // Prompt the user to enter the second string
        System.out.print("Enter the second string to concatenate: ");
        String secondString = scanner.nextLine();
        
        // Concatenate the second string to the end of the first string
        String concatenatedString = firstString.concat(secondString);

        // Display the concatenated string
        System.out.println("Concatenated string: " + concatenatedString);
        
        // Close the scanner
        scanner.close();
    }
}
/* Explanation:
 * The concat() method is used to concatenate the specified string at the end of another string.
 * It returns a new string that represents the concatenation of the two strings.
 */
