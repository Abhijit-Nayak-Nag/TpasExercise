package tpas.gl.training.threadpools;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

    // Define a task class that implements the Runnable interface
    class Taskk implements Runnable {
        private final int taskkId;

        public Taskk(int taskId) {
            this.taskkId = taskId;
        }

        @Override
        public void run() {
            System.out.println("Task " + taskkId + " is running on " + Thread.currentThread().getName());
            try {
                // Simulate some work with Thread.sleep
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Task " + taskkId + " was interrupted.");
            }
            System.out.println("Task " + taskkId + " completed.");
        }
    }

    // Main class to test the thread pool
    public class CachedThreadPool {
        public static void main(String[] args) {
            // Create a cached thread pool
            ExecutorService executorService = Executors.newCachedThreadPool();

            // Submit 5 tasks to the thread pool
            for (int i = 1; i <= 5; i++) {
                Task task = new Task(i);
                executorService.submit(task);
            }

            // Shutdown the executor service
            executorService.shutdown();
        }
    }

