/* Lab Record - 33
 * Write a Java program that performs matrix multiplication using multiple threads.
 * Matrix multiplication is a fundamental operation in linear algebra, where each
 * element of the resulting matrix is computed by taking the dot product of the
 * corresponding row from the first matrix and column from the second matrix.
 */

public class MatrixMultiplication {
    private static final int SIZE = 3; // Size of the square matrices
    private static final int NUM_THREADS = 3; // Number of threads

    public static void main(String[] args) {
        // Create two matrices
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Create the result matrix
        int[][] result = new int[SIZE][SIZE];

        // Create threads for matrix multiplication
        Thread[] threads = new Thread[NUM_THREADS];
        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(new MultiplicationTask(matrixA, matrixB, result, i));
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

        // Print the result matrix
        System.out.println("Result of Matrix Multiplication:");
        printMatrix(result);
    }

    // Method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Inner class representing the task of performing matrix multiplication for a segment of the result matrix
    static class MultiplicationTask implements Runnable {
        private int[][] matrixA;
        private int[][] matrixB;
        private int[][] result;
        private int segment;

        public MultiplicationTask(int[][] matrixA, int[][] matrixB, int[][] result, int segment) {
            this.matrixA = matrixA;
            this.matrixB = matrixB;
            this.result = result;
            this.segment = segment;
        }

        @Override
        public void run() {
            // Determine the segment of rows to process
            int startRow = segment * SIZE / NUM_THREADS;
            int endRow = (segment + 1) * SIZE / NUM_THREADS;

            // Perform matrix multiplication for the assigned segment
            for (int i = startRow; i < endRow; i++) {
                for (int j = 0; j < SIZE; j++) {
                    for (int k = 0; k < SIZE; k++) {
                        result[i][j] += matrixA[i][k] * matrixB[k][j];
                    }
                }
            }
        }
    }
}
