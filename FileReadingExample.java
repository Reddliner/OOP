/* Lab Record - 18
 * Write a Java program to create a method that reads a file and throws an exception if the file is not found.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingExample {
    // Method to read a file
    public static void readFile(String fileName) throws FileNotFoundException {
        // Create a File object with the specified file name
        File file = new File(fileName);
        
        // Check if the file exists
        if (!file.exists()) {
            // If the file does not exist, throw a FileNotFoundException
            throw new FileNotFoundException("File not found: " + fileName);
        }
        
        // If the file exists, proceed to read its contents
        try (Scanner scanner = new Scanner(file)) {
            // Read and print each line of the file
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }
    
    public static void main(String[] args) {
        // Attempt to read a file
        try {
            readFile("sample.txt");
        } catch (FileNotFoundException e) {
            // Catch the FileNotFoundException and print the error message
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
