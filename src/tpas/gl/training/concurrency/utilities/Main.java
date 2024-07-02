package tpas.gl.training.concurrency.utilities;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        // Create a Semaphore with 2 permits
        Semaphore semaphore = new Semaphore(2);

        // Create three threads that attempt to access a shared resource
        Thread thread1 = new Thread(new Worker(semaphore));
        Thread thread2 = new Thread(new Worker(semaphore));
        Thread thread3 = new Thread(new Worker(semaphore));

        // Start all three threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Worker implements Runnable {
    private final Semaphore semaphore;

    public Worker(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            // Acquire a permit from the semaphore
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " is accessing the shared resource.");

            // Simulate some work with Thread.sleep
            Thread.sleep(2000);

            // Release the permit
            semaphore.release();
            System.out.println(Thread.currentThread().getName() + " has released the permit.");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread was interrupted.");
        }
    }
}
