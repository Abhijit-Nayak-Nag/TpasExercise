package tpas.gl.training.threadcoordination;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Create a CountDownLatch with a count of 2
        CountDownLatch latch = new CountDownLatch(2);

        // Create two threads that perform some work
        Thread thread1 = new Thread(new Worker(latch));
        Thread thread2 = new Thread(new Worker(latch));

        // Start both threads
        thread1.start();
        thread2.start();

        // Wait for both threads to complete their work
        latch.await();

        // All threads have completed their work
        System.out.println("All threads have completed their work.");
    }
}

// Worker class that performs some work
class Worker implements Runnable {
    private final CountDownLatch latch;

    public Worker(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            // Simulate some work
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " has completed its work.");
            // Decrease the count of the latch by 1
            latch.countDown();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread was interrupted.");
        }
    }
}

