package tpas.gl.training.completablefuture;

import java.util.concurrent.CompletableFuture;

public class CompletableFuture1 {
    public static void main(String[] args) {
        // Create a CompletableFuture with a completed result
        CompletableFuture<String> completableFuture = CompletableFuture.completedFuture("Hello, World!");

        // Use the CompletableFuture
        completableFuture.thenAccept(result -> {
            // This will be executed immediately since the CompletableFuture is already completed
            System.out.println("Result: " + result);
        });

        // Alternatively, you can get the result directly (this will not block since the future is already completed)
        try {
            String result = completableFuture.get();
            System.out.println("Directly fetched result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
