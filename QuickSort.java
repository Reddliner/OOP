/* Lab Record - 25
 * Write a Java program to sort an array of given integers using the Quick sort algorithm.
 * Quick sort is a comparison sort, meaning it can sort items of any type for which a "less-than" relation
 * (formally, a total order) is defined.
 */

import java.util.Arrays;

public class QuickSort {
    // Method to perform Quick sort
    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(array, low, high);
            
            // Recursively sort elements before and after the pivot index
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }
    
    // Method to partition the array
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // Choose the pivot element
        int i = low - 1; // Index of smaller element
        
        for (int j = low; j < high; j++) {
            // If current element is less than or equal to pivot
            if (array[j] <= pivot) {
                i++;
                // Swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        
        // Swap array[i+1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        
        return i + 1;
    }
    
    // Main method to test Quick sort
    public static void main(String[] args) {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};
        
        System.out.println("Original array: " + Arrays.toString(array));
        
        // Perform Quick sort
        quickSort(array, 0, array.length - 1);
        
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}
