/* Lab Record - 27
 * Write a Java program to sort an array of given integers using the Selection Sort Algorithm.
 * According to Wikipedia, "Selection sort is a sorting algorithm, specifically an in-place comparison sort.
 * It has O(n^2) time complexity, making it inefficient on large lists, and generally performs less efficiently
 * than the similar insertion sort".
 */

import java.util.Arrays;

public class SelectionSort {
    // Method to perform Selection sort
    public static void selectionSort(int[] array) {
        int n = array.length;
        
        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the found minimum element with the first element
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    
    // Main method to test Selection sort
    public static void main(String[] args) {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};
        
        System.out.println("Original array: " + Arrays.toString(array));
        
        // Perform Selection sort
        selectionSort(array);
        
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
