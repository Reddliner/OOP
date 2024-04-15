/* Lab Record - 30
 * Write a Java program to get specific files with extensions from a specified folder.
 */

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GetFilesWithExtensions {
    // Method to get specific files with extensions from r̥a folder
    public static List<File> getFilesWithExtensions(String directoryPath, String[] extensions) {
        // Initialize a list to store matching files
        List<File> matchingFiles = new ArrayList<>();
        
        // Create a File object for the specified directory path
        File directory = new File(directoryPath);
        
        // Check if the directory exists and is a directory
        if (directory.exists() && directory.isDirectory()) {
            // Get list of files in the directory
            File[] files = directory.listFiles();
            
            // Iterate through the files to find matching ones
            for (File file : files) {
                // Check if the file has one of the specified extensions
                for (String extension : extensions) {
                    if (file.getName().endsWith(extension)) {
                        // Add the matching file to the list
                        matchingFiles.add(file);
                        break; // No need to check further extensions for this file
                    }
                }
            }
        } else {
            System.out.println("Directory does not exist or is not a directory.");
        }
        
        return matchingFiles; // Return the list of matching files
    }
    
    // Main method to test getting files with extensions
    public static void main(String[] args) {
        // Provide the directory path
        String directoryPath = "path/to/your/directory";
        
        // Specify the extensions of files to retrieve
        String[] extensions = {".txt", ".java", ".pdf"};
        
        // Get files with specified extensions from the directory
        List<File> matchingFiles = getFilesWithExtensions(directoryPath, extensions);
        
        // Display the matching files
        System.out.println("Files with specified extensions in " + directoryPath + ":");
        for (File file : matchingFiles) {
            System.out.println(file.getName());
        }
    }
    
    /* Explanation:
     * This program defines a class GetFilesWithExtensions with a method getFilesWithExtensions that takes 
     * a directory path and an array of extensions as input and returns a list of files with those extensions 
     * in the specified directory. The main method initializes the directory path and extensions, calls the 
     * getFilesWithExtensions method, and displays the matching files.
     */
}
