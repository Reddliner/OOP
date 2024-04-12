/* Lab Record - 20
 * Write a Java program to check whether a string contains only a certain set of characters (in this case
 * a-z, A-Z and 0-9).
 */

import java.util.Scanner;

public class CharacterChecker {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        // Define a regular expression to match only a-z, A-Z, and 0-9
        String regex = "[a-zA-Z0-9]+";

        // Check if the input string matches the regular expression
        boolean containsOnlySpecifiedChars = input.matches(regex);
        
        // Display the result
        if (containsOnlySpecifiedChars) {
            // If the input string matches the regex, it contains only a-z, A-Z, and 0-9
            System.out.println("The string contains only a-z, A-Z, and 0-9.");
        } else {
            // If the input string does not match the regex, it contains other characters
            System.out.println("The string contains other characters than a-z, A-Z, and 0-9.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
/* Explanation of the regular expression "[a-zA-Z0-9]+":
 * [a-zA-Z0-9]: Matches any character that is a lowercase letter (a-z), uppercase letter (A-Z), or digit (0-9).
 * +: Quantifier that matches one or more occurrences of the preceding character class [a-zA-Z0-9].
 * So, the regex matches any string that contains one or more characters, each of which is either a lowercase letter,
 * uppercase letter, or digit. If the entire input string matches this pattern, it contains only the specified characters.
 */
