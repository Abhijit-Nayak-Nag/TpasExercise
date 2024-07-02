package tpas.gl.training.concurrency.utilities;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Problem2 {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, () -> {
            System.out.println("Barrier point reached. All threads have passed the barrier.");
        });

        // Create three threads that will wait at the barrier point
        Thread thread1 = new Thread(new Workerr(barrier));
        Thread thread2 = new Thread(new Workerr(barrier));
        Thread thread3 = new Thread(new Workerr(barrier));

        // Start all three threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

// Worker class that waits at the barrier point
class Workerr implements Runnable {
    private final CyclicBarrier barrier;

    public Workerr(CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is waiting at the barrier point.");
            // Wait at the barrier point
            barrier.await();

            // After passing the barrier point, simulate some work with Thread.sleep
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + " has completed its task.");
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }

    }
}
