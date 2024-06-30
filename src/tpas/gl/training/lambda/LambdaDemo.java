package tpas.gl.training.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo {
    public static void main(String[] args) {
        // Using lambda with Runnable
        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task running: " + i);
                try {
                    Thread.sleep(500); // Sleep for 500 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Thread thread = new Thread(task);
        thread.start();

        // Using lambda with Comparator
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("David");

        // Sort names in reverse order using lambda expression
        Comparator<String> reverseOrder = (s1, s2) -> s2.compareTo(s1);

        Collections.sort(names, reverseOrder);

        System.out.println("Names in reverse order: " + names);
    }
}
