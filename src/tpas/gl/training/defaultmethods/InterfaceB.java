package tpas.gl.training.defaultmethods;

public interface InterfaceB {
    default void show() {
        System.out.println("Default method from InterfaceB");
    }
}
