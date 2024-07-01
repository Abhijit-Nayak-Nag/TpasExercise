package tpas.gl.training.multithreading;

public class MyRunnable {
    public static void main(String[] args) {
        // Create an instance of the MyRunnable class
        Mainn main = new Mainn();

        // Create a Thread object and pass the MyRunnable instance to it
        Thread thread = new Thread(main);

        // Start the thread
        thread.start();

        // Print a message from the main thread
        System.out.println("Main thread is running.");

    }

}
class Mainn implements Runnable {
    // Override the run() method to define the thread's behavior
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



