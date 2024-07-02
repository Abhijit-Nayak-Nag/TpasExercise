package tpas.gl.training.threadpools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

    // Define a task class that implements the Runnable interface
    class Task implements Runnable {
        private final int taskId;

        public Task(int taskId) {
            this.taskId = taskId;
        }

        @Override
        public void run() {
            System.out.println("Task " + taskId + " is running on " + Thread.currentThread().getName());
            try {
                // Simulate some work with Thread.sleep
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Task " + taskId + " was interrupted.");
            }
            System.out.println("Task " + taskId + " completed.");
        }
    }

    // Main class to test the thread pool
    public class ThreadPool {
        public static void main(String[] args) {
            // Create a fixed-size thread pool with 3 threads
            ExecutorService executorService = Executors.newFixedThreadPool(3);

            // Submit 5 tasks to the thread pool
            for (int i = 1; i <= 5; i++) {
                Task task = new Task(i);
                executorService.submit(task);
            }

            // Shutdown the executor service
            executorService.shutdown();
        }
    }


