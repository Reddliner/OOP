/* Lab Record - 21
 * Write a Java program to validate a personal identification number (PIN).
 * Assume a PIN number is 4, 6, or 8.
 * Using regular expressions for validation.
 */

import java.util.Scanner;

public class PINValidator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a PIN
        System.out.print("Enter a PIN number (4, 6, or 8 digits): ");
        String pin = scanner.nextLine();
        
        // Define regular expressions for 4, 6, and 8-digit PINs
        String regex4 = "\\d{4}";
        String regex6 = "\\d{6}";
        String regex8 = "\\d{8}";

        // Check if the input PIN matches any of the valid formats
        if (pin.matches(regex4) || pin.matches(regex6) || pin.matches(regex8)) {
            System.out.println("Valid PIN.");
        } else {
            System.out.println("Invalid PIN. PIN must be 4, 6, or 8 digits long.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
/* Explanation of regular expressions:
 * \d: Matches any digit (0-9).
 * {n}: Quantifier that matches exactly n occurrences of the preceding character class.
 * So, \\d{4} matches a 4-digit PIN, \\d{6} matches a 6-digit PIN, and \\d{8} matches an 8-digit PIN.
 */
