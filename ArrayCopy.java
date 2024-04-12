/* Lab Record - 13
 * Write a Java program to copy an array by iterating the array.
 */

public class ArrayCopy {
    public static void main(String[] args) {
        // Original array
        int[] originalArray = {1, 2, 3, 4, 5};
        
        // Create a new array to store the copy
        int[] copiedArray = new int[originalArray.length];
        
        // Iterate through the original array and copy each element to the new array
        int index = 0;
        while (index < originalArray.length) {
            copiedArray[index] = originalArray[index];
            index++;
        }
        
        // Print the original array
        System.out.print("Original Array: ");
        for (int i = 0; i < originalArray.length; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();
        
        // Print the copied array
        System.out.print("Copied Array: ");
        for (int i = 0; i < copiedArray.length; i++) {
            System.out.print(copiedArray[i] + " ");
        }
        System.out.println();
    }
}
