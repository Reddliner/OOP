/* Lab Record - 17
 * Write a Java program that throws an exception and catches it using a try-catch.
 */

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Attempt to divide by zero, which will throw an ArithmeticException
            int result = 10 / 0;
            System.out.println("Result: " + result); // This line will not execute
        } catch (ArithmeticException e) {
            // Catch the ArithmeticException and print a message
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
