package tpas.gl.training.threadcoordination;

class SharedResource {
    private boolean isAvailable = false;

    // Method to be called by the waiting thread
    public synchronized void waitForCondition() {
        while (!isAvailable) {
            try {
                System.out.println("Waiting for the condition to be met...");
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Thread was interrupted.");
            }
        }
        System.out.println("Condition met. Proceeding with the task...");
    }

    // Method to be called by the notifying thread
    public synchronized void notifyCondition() {
        isAvailable = true;
        System.out.println("Condition is met. Notifying the waiting thread...");
        notify();
    }
}
public class ThreadCoordination {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        // Thread that waits for the condition to be met
        Thread waitingThread = new Thread(() -> {
            sharedResource.waitForCondition();
        });

        // Thread that notifies the waiting thread when the condition is met
        Thread notifyingThread = new Thread(() -> {
            try {
                // Simulate some work with Thread.sleep
                Thread.sleep(2000); // Sleep for 2 seconds to simulate work
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            sharedResource.notifyCondition();
        });

        // Start both threads
        waitingThread.start();
        notifyingThread.start();

        // Wait for both threads to finish
        try {
            waitingThread.join();
            notifyingThread.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Both threads have finished execution.");

    }
}
