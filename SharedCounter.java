/* Lab Record - 34
 * Write a Java program to create and start multiple threads that increment a shared counter variable
 * concurrently.
 * This program demonstrates the concept of thread synchronization and race conditions.
 */

public class SharedCounter {
    private static final int NUM_THREADS = 8; // Number of threads
    private static final int NUM_INCREMENTS = 1000; // Number of increments per thread
    private static int counter = 0; // Shared counter variable

    public static void main(String[] args) {
        // Create and start multiple threads
        Thread[] threads = new Thread[NUM_THREADS];
        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i] = new Thread(new IncrementTask());
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

        // Print the final value of the counter
        System.out.println("Final Counter Value: " + counter);
    }

    // Inner class representing the task of incrementing the shared counter
    static class IncrementTask implements Runnable {
        @Override
        public void run() {
            // Increment the counter multiple times
            for (int i = 0; i < NUM_INCREMENTS; i++) {
                synchronized (SharedCounter.class) { // Ensure thread-safe access to the shared counter
                    counter++;
                }
            }
        }
    }
}
