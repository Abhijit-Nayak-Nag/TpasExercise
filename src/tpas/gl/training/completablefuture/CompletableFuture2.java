package tpas.gl.training.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture2{
    public static void main(String[] args) {
        // Create a CompletableFuture that supplies a result asynchronously
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            // Simulate some long-running computation or I/O operation
            try {
                Thread.sleep(1000); // Sleep for 1 second to simulate work
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Hello, World!";
        });

        // Use thenAccept to process the result when it becomes available
        completableFuture.thenAccept(result -> {
            System.out.println("Result: " + result);
        });

        // Ensure the main thread waits for the CompletableFuture to complete
        try {
            // This will block until the result is available
            completableFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
