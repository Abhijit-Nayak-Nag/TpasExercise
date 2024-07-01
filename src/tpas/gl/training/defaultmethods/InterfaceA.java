package tpas.gl.training.defaultmethods;

public interface InterfaceA {
    default void show() {
        System.out.println("Default method from InterfaceA");
    }
}
