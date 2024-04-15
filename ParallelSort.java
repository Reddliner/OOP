/* Lab Record - 32
 * Write a Java program that sorts an array of integers using multiple threads.
 */

import java.util.Arrays;

public class ParallelSort {
    private static final int ARRAY_SIZE = 1000;
    private static final int NUM_THREADS = 4;

    public static void main(String[] args) {
        // Create array and print before sorting
        int[] array = createArray();
        System.out.println("Before sorting: " + Arrays.toString(array));

        // Create threads and divide the array into segments
        Thread[] threads = new Thread[NUM_THREADS];
        int segmentSize = ARRAY_SIZE / NUM_THREADS;
        for (int i = 0; i < NUM_THREADS; i++) {
            int startIndex = i * segmentSize;
            int endIndex = (i == NUM_THREADS - 1) ? ARRAY_SIZE - 1 : (startIndex + segmentSize - 1);
            threads[i] = new Thread(new SortTask(array, startIndex, endIndex));
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Perform final merge sort
        mergeSort(array, 0, ARRAY_SIZE - 1);

        // Print after sorting
        System.out.println("After sorting: " + Arrays.toString(array));
    }

    // Method to create an array with random numbers
    private static int[] createArray() {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = (int) (Math.random() * 400); // Generate random numbers between 0 and 400
        }
        return array;
    }

    // Recursive method to perform merge sort
    private static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    // Method to merge two sorted arrays
    private static void merge(int[] array, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = array[i++];
        }
        while (j <= right) {
            temp[k++] = array[j++];
        }
        System.arraycopy(temp, 0, array, left, temp.length);
    }

    // Inner class representing the task of sorting a segment of the array
    static class SortTask implements Runnable {
        private int[] array;
        private int startIndex;
        private int endIndex;

        public SortTask(int[] array, int startIndex, int endIndex) {
            this.array = array;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public void run() {
            Arrays.sort(array, startIndex, endIndex + 1); // Sort the segment of the array
        }
    }
}
