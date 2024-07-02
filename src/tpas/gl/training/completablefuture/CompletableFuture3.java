package tpas.gl.training.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuture3 {
    public static void main(String[] args){
        // Create the first CompletableFuture that supplies a result asynchronously
        CompletableFuture<Integer> future1 = CompletableFuture.supplyAsync(() -> {
            try {
                // Simulate some work with Thread.sleep
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return 20;
        });

        // Create the second CompletableFuture that supplies a result asynchronously
        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(() -> {
            try {
                // Simulate some work with Thread.sleep
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return 30;
        });

        // Combine both CompletableFutures using thenCombine
        CompletableFuture<Integer> combinedFuture = future1.thenCombine(future2, (result1, result2) -> {
            // Perform some action when both are complete
            return result1 + result2;
        });

        // Use thenAccept to process the combined result
        combinedFuture.thenAccept(result -> {
            System.out.println("Combined Result: " + result);
        });

        // Ensure the main thread waits for the CompletableFuture to complete
        try {
            // This will block until the combined result is available
            combinedFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

    }
}
