/* Lab Record - 29
 * Write a Java program to get a list of all file/directory names in the given directory.
 */

import java.io.File;

public class ListFilesInDirectory {
    // Method to list all files and directories in the given directory
    public static void listFiles(String directoryPath) {
        File directory = new File(directoryPath);
        
        // Check if the directory exists
        if (directory.exists() && directory.isDirectory()) {
            // Get list of files and directories in the directory
            File[] files = directory.listFiles();
            
            // Display file and directory names
            System.out.println("Files and directories in " + directoryPath + ":");
            for (File file : files) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Directory does not exist or is not a directory.");
        }
    }
    
    // Main method to test listing files in a directory
    public static void main(String[] args) {
        // Provide the directory path
        String directoryPath = "path/to/your/directory";
        
        // List files and directories in the given directory
        listFiles(directoryPath);
    }
}
    
/* Explanation:
 * This program defines a class ListFilesInDirectory with a method listFiles that takes a directory path 
 * as input and lists all the files and directories in that directory. The main method initializes the 
 * directory path and calls the listFiles method to display the list of files and directories.
 */
