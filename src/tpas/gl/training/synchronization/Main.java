package tpas.gl.training.synchronization;
// Define a class with a synchronized method to increment a counter
class Counter {
    private int count = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        count++;
    }

    // Method to get the current value of the counter

    public int getCount() {
        return count;
    }
}

// Define a Runnable class that increments the counter
class CounterRunnable implements Runnable {
    private Counterr counterr;

    public CounterRunnable(Counterr counterr) {
        this.counterr = counterr;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counterr.increment();
        }
    }
}

// Main class to test the synchronization
public class Main {
    public static void main(String[] args) {
        Counterr counterr = new Counterr();

        // Create two threads that share the same counter
        Thread thread1 = new Thread(new CounterRunnable(counterr));
        Thread thread2 = new Thread(new CounterRunnable(counterr));

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted: " + e.getMessage());
        }

        // Print the final value of the counter
        System.out.println("Final count: " + counterr.getCount());
    }
}

