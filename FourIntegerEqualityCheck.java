/* Lab Record - 1
 * 
 * This program accepts four integers from the user and prints "Equal" if all four are equal,
 * and "Not Equal" otherwise.
 */

import java.util.Scanner;

/**
 * This program accepts four integers from the user and prints "Equal" if all four are equal,
 * and "Not Equal" otherwise.
 */
public class FourIntegerEqualityCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter four integers
        System.out.println("Enter four integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        
        // Check if all four integers are equal
        if (num1 == num2 && num2 == num3 && num3 == num4) {
            // If all four are equal, print "Equal"
            System.out.println("Equal");
        } else {
            // If any of the integers are not equal, print "Not Equal"
            System.out.println("Not Equal");
        }
        
        // Close the Scanner object to prevent resource leaks
        scanner.close();
    }
}
