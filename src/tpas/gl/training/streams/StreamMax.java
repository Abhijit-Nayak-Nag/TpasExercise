package tpas.gl.training.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMax {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);

        // Find the maximum element in the list
        Optional<Integer> maxNumber = numbers.stream()
                .max(Integer::compareTo);

        // Print the maximum element if present
        maxNumber.ifPresent(max -> System.out.println("Maximum number: " + max));
    }
}
