package tpas.gl.training.defaultmethods;

public class MultipleInheritanceDemo implements InterfaceA, InterfaceB {
    @Override
    public void show() {
        InterfaceA.super.show(); // Calling InterfaceA's default method
        InterfaceB.super.show(); // Calling InterfaceB's default method
        System.out.println("Overridden method in MultipleInheritanceDemo");
    }

    public static void main(String[] args) {
        MultipleInheritanceDemo obj = new MultipleInheritanceDemo();
        obj.show(); // Calling the overridden method

    }
}

