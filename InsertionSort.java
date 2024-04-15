/* Lab Record - 28
 * Write a Java program to sort an array of given integers using the Insertion sort algorithm.
 * Insertion sort is a simple sorting algorithm that builds the final sorted array (or list) one item at a time.
 * It is much less efficient on large lists than other algorithms such as quicksort, heapsort, or merge sort.
 */

import java.util.Arrays;

public class InsertionSort {
    // Method to perform Insertion sort
    public static void insertionSort(int[] array) {
        int n = array.length;
        
        // Iterate through the array starting from the second element
        for (int i = 1; i < n; i++) {
            int key = array[i]; // Current element to be inserted
            int j = i - 1;
            
            // Move elements of array[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key; // Place key at its correct position
        }
    }
    
    // Main method to test Insertion sort
    public static void main(String[] args) {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};
        
        System.out.println("Original array: " + Arrays.toString(array));
        
        // Perform Insertion sort
        insertionSort(array);
        
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
