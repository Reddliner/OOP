/* Lab Record - 26
 * Write a Java program to sort an array of given integers using the Bubble Sorting Algorithm.
 * According to Wikipedia, "Bubble sort, sometimes called sinking sort, is a simple sorting algorithm
 * that repeatedly steps through the list to be sorted. It compares each pair of adjacent items and swaps
 * them if they are in the wrong order. The pass through the list is repeated until no swaps are needed,
 * which indicates the list is in order. The algorithm, which is a comparison sort, is named for the way
 * smaller elements "bubble" to the top of the list. Although the algorithm is simple, it is too slow and
 * impractical for most problems even compared to an insertion sort. It can be practical if the input is
 * usually in sort order but occasionally has some out-of-order elements nearly in position."
 */

import java.util.Arrays;

public class BubbleSort {
    // Method to perform Bubble sort
    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                // If current element is greater than next element, swap them
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in inner loop, then the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
    
    // Main method to test Bubble sort
    public static void main(String[] args) {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};
        
        System.out.println("Original array: " + Arrays.toString(array));
        
        // Perform Bubble sort
        bubbleSort(array);
        
        System.out.println("Sorted array: " + Arrays.toString(array));
    }
}