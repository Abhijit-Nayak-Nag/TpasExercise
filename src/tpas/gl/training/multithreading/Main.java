package tpas.gl.training.multithreading;

 class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is running: " + i);
            try {
                // Sleep for 1 second to simulate some work
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e.getMessage());
            }
        }
    }
}

// Main class to test the thread
public class Main {
    public static void main(String[] args) {
        // Create an instance of the MyThread class
        MyThread myThread = new MyThread();

        // Start the thread
        myThread.start();

        // Print a message from the main thread
        System.out.println("Main thread is running.");
    }
}