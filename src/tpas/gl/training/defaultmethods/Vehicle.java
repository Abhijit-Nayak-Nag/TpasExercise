package tpas.gl.training.defaultmethods;

public interface Vehicle {
    // Abstract method
    void start();

    // Default method
    default void stop() {
        System.out.println("Vehicle is stopping");
    }
}

